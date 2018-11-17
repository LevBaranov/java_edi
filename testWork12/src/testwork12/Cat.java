/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork12;

/**
 *
 * @author levbaranov
 */
public class Cat implements Pet{
    @Override
    public String voice(){
        return "Мяу";
    }
    @Override
    public String name(){
         return "Мурзик";
    }
}
