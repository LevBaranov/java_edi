/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork;

import java.util.Random;

/**
 * Первое задание
 * @author levbaranov
 */
public class TestWork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random rand = new Random();
        //Пределы (-10;10)
        double min = -10;
        double max = 10;
        double x = rand.nextDouble() * Math.abs(max-min) + min;
        System.out.println("Случайное число в пределах от -10 до 10: " + x);
        //Первый график
        double y1 = Math.pow(x,3);
        //второй график
        double y2 = 10*Math.sin(x);
        boolean res = x >= 0 && x <= y1;
        boolean res2 = x >= 0 && x <= y2;
        
        System.out.println("Результат попадания в область.\nГрафик 1: " + res);
        System.out.println("График 2: " + res2);
    }
    
}
