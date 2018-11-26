/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middleearth;

/**
 *
 * @author levbaranov
 */
public class Troll  extends MiddleEarthCitizen {
    private String homeTown;
    private int age;
    
    public Troll(String homeTown, String name, int age, int height, int power) {
        super(name, height, power);
        this.homeTown = homeTown;
        this.age = age;
    }
    public String setHomeTown(String t){
        this.homeTown = t;
        return this.homeTown;
    }
    public String getHomeTown(){
        return this.homeTown;
    }
    public int setAge(int a){
        this.age = a;
        return this.age;
    }
    public int getAge(){
        return this.age;
    }
    public Troll() {
    }
    @Override
    public String getFlank(){
        flank = "Тёмная сторона";
        return flank;
    }
    @Override
    public String toString() {
        String str = super.toString() + " " + this.homeTown + " " + this.age;
        return str;
    }
}
