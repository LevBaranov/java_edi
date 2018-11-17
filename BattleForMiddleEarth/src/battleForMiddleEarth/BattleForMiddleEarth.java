/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleForMiddleEarth;
import java.util.ArrayList;
import java.util.Random;
import middleearth.*;
import static middleearth.MiddleEarthCitizen.*;    

/**
 *
 * @author levbaranov
 */
public class BattleForMiddleEarth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Задание 11
        
        */
        Object[] combinedArmy = new Object[100];
        Random r = new Random();
        int age = 20;
        for(int i = 1; i < combinedArmy.length; i++){//String warrior : combinedArmy){
            if (r.nextBoolean()){
                combinedArmy[i] = new Rohhirim(age, "Ivan");
            }else{
                combinedArmy[i] = new Troll("TrollTown", age, 200, "Petr");
            }
            //System.out.println(combinedArmy[i].toString());
        }
        /* 
        * конец Задание 11.
        * Второй вариант решения
        */
        ArrayList combinedArmy2 = new ArrayList(100);
        for(int i = 1; i < combinedArmy2.size(); i++){
            if (r.nextBoolean()){
                combinedArmy2.add(new Rohhirim(age, "Ivan"));
            }else{
                combinedArmy2.add(new Troll("TrollTown", age, 200, "Petr"));
            }
            
            //System.out.println(combinedArmy2[i].toString());
        }
    }
    
}
