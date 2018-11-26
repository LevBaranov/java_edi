/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleForMiddleEarth;

import middleearth.UnitDark;
import middleearth.UnitLight;
import java.util.ArrayList;
import java.util.Random;
import middleearth.*;

/**
 *
 * @author levbaranov
 */
public class BattleForMiddleEarth {

    static Random rand = new Random();

    private static int randMaxMin(int max, int min) {
        //Генерируем случайное кол-во между максимум и минимум
        if(max == min){
            return max;
        }else{
            return min + rand.nextInt(max - min);
        }
    }

    public static void main(String[] args) {
        //Определяем основные диапазоны в которых будем рандомно выбирать
        int minHeight = 120;
        int maxHeight = 200;
        int minAge = 20;
        int maxAge = 200;
        int minCount = 1;
        int maxCount = 20;
        //Массив с именами
        ArrayList<String> nameList = new ArrayList(7);
        nameList.add("Иван");
        nameList.add("Петр");
        nameList.add("Кирилл");
        nameList.add("Михаил");
        nameList.add("Влад");
        nameList.add("Генадий");
        nameList.add("Кандрат");

        Army DarkArmy = new Army(); //Экземпляр класса Армия для Армии Тьмы
        Army LightArmy = new Army();//Экземпляр класса Армия для Армии Света
        //Определяем кол-во участников в армии с обеих сторон
        DarkArmy.setCount(randMaxMin(maxCount, minCount));
        LightArmy.setCount(randMaxMin(maxCount, minCount));

        int countArmy; //Кол-во едениц в армии для цикла ниже
        countArmy = LightArmy.getCount();
        if (rand.nextBoolean()) {
            //Чародей создается случайным образом
            String nameUnit = nameList.get(rand.nextInt(7));
            int ageUnit = randMaxMin(maxAge, minAge);
            int heightUnit = randMaxMin(maxHeight, minHeight);
            int powerUnit = 20 + (randMaxMin(UnitAnimal.HORSE.maxPower, UnitAnimal.HORSE.minPower));
            LightArmy.rider.add(new Wizard("Чародейск", nameUnit, ageUnit, heightUnit, powerUnit));
            --countArmy;
            //System.out.println("У светлых есть маг " + nameUnit + ", с силой "+ powerUnit);
        }
        do {
            UnitLight uL = UnitLight.getRandomUnitLight();
            String n = uL.nameRace;
            String nameUnit = nameList.get(rand.nextInt(7));
            int ageUnit = randMaxMin(maxAge, minAge);
            int heightUnit = randMaxMin(maxHeight, minHeight);
            int powerUnit;
            if (n.equals("Rohhirim")) {
                powerUnit = (randMaxMin(UnitLight.HUMAN.maxPower, UnitLight.HUMAN.minPower)) + (randMaxMin(UnitAnimal.HORSE.maxPower, UnitAnimal.HORSE.minPower));
                //System.out.println("Сила Роххирима: " + powerUnit);
            } else {
                powerUnit = randMaxMin(uL.maxPower, uL.minPower);
            }
            switch (n) {
                case ("Elf"):
                    //ELF("Elf", 7, 4),
                    LightArmy.solder.add(new Elf("Эльфийск", nameUnit, ageUnit, heightUnit, powerUnit));
                    break;
                case ("Human"):
                    //HUMAN("Human", 8, 7),
                    LightArmy.solder.add(new Human("Людск", nameUnit, ageUnit, heightUnit, powerUnit));
                    break;
                case ("Rohhirim"):
                    //ROHHIRIM("Rohhirim"),
                    LightArmy.rider.add(new Rohhirim(nameUnit, ageUnit, heightUnit, powerUnit));
                    break;
                case ("WoodenElf"):
                    //WOODENELF("WoodenElf", 6, 6);
                    LightArmy.solder.add(new WoodenElf(nameUnit, ageUnit, heightUnit, powerUnit));
                    break;
            }
            --countArmy;
//            System.out.println(countArmy);
        } while (countArmy != 0);
        countArmy = DarkArmy.getCount();
        do {
            UnitDark uD = UnitDark.getRandomUnitDark();
            String n = uD.nameRace;
            String nameUnit = nameList.get(rand.nextInt(7));
            int ageUnit = randMaxMin(maxAge, minAge);
            int heightUnit = randMaxMin(maxHeight, minHeight);
            int powerUnit;
            if (n.equals("Orc")) {
                powerUnit = (randMaxMin(UnitDark.ORC.maxPower, UnitDark.ORC.minPower)) + (randMaxMin(UnitAnimal.WOLF.maxPower, UnitAnimal.WOLF.minPower));
            } else {
                powerUnit = randMaxMin(uD.maxPower, uD.minPower);
            }
            switch (n) {
                case ("Goblin"):
                    //GOBLIN("Goblin", 5, 2),
                    DarkArmy.solder.add(new Goblin("Гоблинск", nameUnit, ageUnit, heightUnit, powerUnit));
                    break;
                case ("Orc"):
                    //ORC("Orc", 10, 8),
                    DarkArmy.rider.add(new Orc("Орковск", nameUnit, ageUnit, heightUnit, powerUnit));
                    break;
                case ("Troll"):
                    //TROLL("Troll", 15, 11),
                    DarkArmy.solder.add(new Troll("Троллянд", nameUnit, ageUnit, heightUnit, powerUnit));
                    break;
                case ("UrukHai"):
                    //URUKHAI("UrukHai", 12, 10),
                    DarkArmy.solder.add(new UrukHai(nameUnit, ageUnit, heightUnit, powerUnit));
                    break;
            }
            --countArmy;
        } while (countArmy != 0);
        
        System.out.println("Состав светлых:");
        LightArmy.printArmy();
        System.out.println("Состав тёмных:");
        DarkArmy.printArmy();
        
        
        ArrayList<MiddleEarthCitizen> survivorSolder;
        ArrayList<MiddleEarthCitizen> survivorRider;
        System.out.println("==Первый раунд== ==Всадники==");
        if (!LightArmy.rider.isEmpty() && !DarkArmy.rider.isEmpty()){
            Round(LightArmy.rider, DarkArmy.rider, false);
        }        
        
        if (DarkArmy.rider.size() <= 0) {
            System.out.println("Тёмные всадники повержены.\nКол-во светлых:" + LightArmy.rider.size());
            survivorRider = LightArmy.rider;
        } else {
            System.out.println("Светлые всадники повержены.\nКол-во тёмных:" + DarkArmy.rider.size());
            survivorRider = DarkArmy.rider;
        }
        System.out.println("==Второй раунд== ==Пехота==");
        if (!LightArmy.solder.isEmpty() && !DarkArmy.solder.isEmpty()){
            Round(LightArmy.solder, DarkArmy.solder, false);
        }  
               
        if (DarkArmy.solder.size() <= 0) {
            survivorSolder = LightArmy.solder;
            System.out.println("Тёмные пехотинцы повержены.\nКол-во светлых:" + LightArmy.solder.size());
        } else {
            survivorSolder = DarkArmy.solder;
            System.out.println("Светлые пехотинцы повержены.\nКол-во тёмных:" + DarkArmy.solder.size());
        }
        System.out.println("==Третий раунд== ==Выжевщие==");
        Round(survivorRider, survivorSolder, true);
        if (DarkArmy.solder.size() <= 0 && DarkArmy.rider.size() <= 0) {
            System.out.println("Тёмные повержены.\nКол-во светлых всадников:" + LightArmy.rider.size() + "\nКол-во светлых пехотинцев:" + LightArmy.solder.size());
        }else{
            System.out.println("Светлые повержены.\nКол-во темных всадников:" + DarkArmy.rider.size() + "\nКол-во темных пехотинцев:" + DarkArmy.solder.size());
        }
    }

    public static void Round(ArrayList<MiddleEarthCitizen> first, ArrayList<MiddleEarthCitizen> second, boolean strike) {
        do {
            MiddleEarthCitizen fighterFirst = first.get(rand.nextInt(first.size()));
            MiddleEarthCitizen fighterSecond = second.get(rand.nextInt(second.size()));

            if (rand.nextBoolean() || strike) {
                //первым бъет first
                System.out.println("Первым наносит удар " + fighterFirst.getName() + ", представитель:" + fighterFirst.getFlank() + ", имеет силу:" + fighterFirst.getPower());
                System.out.println("Первым получает удар " + fighterSecond.getName() + ", представитель:" + fighterSecond.getFlank() + ", имеет силу:" + fighterSecond.getPower());
                Pvp(fighterFirst, fighterSecond, first, second);
            } else {
                //первым бъет second
                System.out.println("Первым наносит удар " + fighterSecond.getName() + ", представитель:" + fighterSecond.getFlank() + ", имеет силу:" + fighterSecond.getPower());
                System.out.println("Первым получает удар " + fighterFirst.getName() + ", представитель:" + fighterFirst.getFlank() + ", имеет силу:" + fighterFirst.getPower());
                Pvp(fighterSecond, fighterFirst, second, first);
            }
                
        }while (first.size() > 0 && second.size() > 0);
    }

    public static void Pvp(MiddleEarthCitizen first, MiddleEarthCitizen second, ArrayList<MiddleEarthCitizen> firstArmy, ArrayList<MiddleEarthCitizen> secondArmy) {
        Integer powerAttack = first.getPower();
        int healthFirst ;
        int healthSecond = second.getPower();
        if (powerAttack.compareTo(healthSecond) > 0) {
            // Если сила атаки больше чем здоровья удаляем проигравщий юнит из массива.
            System.out.println(first.getName() + " сила после раунда:" + first.getPower());
            System.out.println(second.getName() + " - убит");
            secondArmy.remove(second);
        } else {
            second.setPower(healthSecond - powerAttack.intValue());
            healthFirst = first.setPower(powerAttack.intValue() - second.getPower());
            if(healthFirst >0 ){
                System.out.println(second.getName() + " сила после раунда:" + second.getPower());
                System.out.println(first.getName() + " сила после раунда:" + first.getPower());
            }else{
                System.out.println(second.getName() + " сила после раунда:" + second.getPower());
                System.out.println(first.getName() + " - убит");
                firstArmy.remove(first);
            }
            
        }
    }
}
