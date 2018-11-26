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
public class MiddleEarthCitizen {
    private String name;
    protected String flank;
    private int heightCm;
    private int power;
    static String origin = "Средиземье";
    MiddleEarthCitizen(){
        
    }
    protected MiddleEarthCitizen(String n, int h, int p){
        this.name = n;
        this.power = p;
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
    public static String getCountryOrigin(){
        return origin;
    }
    public int setPower(int p){
        this.power = p;
        return this.power;
    }
    public int getPower(){
        return this.power;
    }
    public String getFlank(){
        return flank;
    }
    
    @Override
    public String toString() {
        String str = this.name + " " + this.heightCm + " " + this.power;
        return str;
    }
    
}