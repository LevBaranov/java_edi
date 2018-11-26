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
public class Rohhirim extends Human{
    Horse horse;
    int powerSum;
    private static String homeTown = "Рохан";
    public Rohhirim(String name, int age, int height, int power) {
        super(homeTown, name, age, height, power);
    }
    
    public Horse getHorse() {
        return this.horse;
    }

    public void setHorse(String c, String b, int p) {
        this.horse = new Horse(c, b, p);
    }
    
    public Rohhirim() {
    }
}
