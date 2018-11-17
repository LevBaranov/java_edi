/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork2;

/**
 * Второе задание
 * @author levbaranov
 */
public class TestWork2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arrWeight = {0.052, 0.048, 0.052, 0.043, 0.050, 0.048, 0.049, 0.054, 0.048, 0.045};
        double refWeight = 0.05;
        double sum = 0;
        for(double weight : arrWeight){
            sum = sum + weight;
        }
        double avrg = sum/arrWeight.length;
        boolean warning = (avrg*100/refWeight)<90;
        System.out.println("Средний вес таблетки: " + avrg);
        if (warning){
            System.out.println("Средний вес таблетки ниже эталонного на 10%");
        }
    }
    
}
