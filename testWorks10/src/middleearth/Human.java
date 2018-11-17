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
public class Human extends MiddleEarthCitizen {
    private String homeTown;
    private int age;
    
    public Human(String homeTown, int age, int height, String name) {
        super(name, height);
        this.homeTown = homeTown;
        this.age = Integer.valueOf(age);
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
    @Override
    public String toString() {
        String str = super.toString() + " " + this.homeTown + " " + this.age;
        return str;
    }
}
