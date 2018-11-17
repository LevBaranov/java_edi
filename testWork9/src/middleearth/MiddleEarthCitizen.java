/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package middleearth;

/**
 *
 * @author levlb
 */
public class MiddleEarthCitizen {
    private String name;
    private int heightCm;
    static String origin = "Средиземье";
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
    static String getCountryOrigin(){
        return origin;
    }
}
