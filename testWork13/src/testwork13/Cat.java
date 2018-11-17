/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork13;

/**
 *
 * @author levbaranov
 */
public class Cat extends Pet{
    @Override
    public String voice(){
        return "Мяу";
    }
    @Override
    public void name(){
         System.out.println("Мурзик");// "Мурзик";
    }
}
