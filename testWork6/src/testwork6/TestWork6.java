/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork6;

/**
 * Задание 6
 * @author levbaranov
 */

class MiddleEarthCitizen {
    String name;
    int heightCm;
    MiddleEarthCitizen(){
        
    }
    MiddleEarthCitizen(String n, int h){
        this.name = n;
        this.heightCm = h;
    }
    double heightToMeters(){
        return (double)this.heightCm/100;
    }
}

public class TestWork6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MiddleEarthCitizen man = new MiddleEarthCitizen();
        MiddleEarthCitizen man2 = new MiddleEarthCitizen("Kek", 550);
        System.out.println(man2.heightToMeters());
    }
    
}
