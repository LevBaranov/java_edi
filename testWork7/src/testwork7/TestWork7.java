/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork7;

/**
 * Задание 7
 * @author levbaranov
 */

class MiddleEarthCitizen {
    private String name;
    private int heightCm;
    MiddleEarthCitizen(){
        
    }
    MiddleEarthCitizen(String n, int h){
        this.name = n;
        this.heightCm = h;
    }
    public String setName(String n){
        this.name = n;
        return this.name;
    }
    public String getName(){
        return this.name;
    }
    public int setHeight(int h){
        this.heightCm = h;
        return this.heightCm;
    }
    public int getHeight(){
        return this.heightCm;
    }
    public double heightToMeters(){
        return (double)this.heightCm/100;
    }
}

public class TestWork7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiddleEarthCitizen man = new MiddleEarthCitizen();
        MiddleEarthCitizen man2 = new MiddleEarthCitizen("Kek", 550);
        System.out.println(man2.heightToMeters());
        man.setName("geg");
        man.setHeight(100);
        System.out.println(man.getName());
        System.out.println(man2.getName());
        System.out.println(man2.getHeight());
        System.out.println(man.getHeight());
        
    }
    
}