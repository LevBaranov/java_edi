/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork4;

import java.util.Arrays;

/**
 * Задание 4
 * @author levbaranov
 */
public class TestWork4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a ={ 1,2,2,3};
        int[] b ={ 3,4,5,7};
        swapValues(a , b);
    }
    static void swapValues(int[] a, int[] b) { 
        int[] c = Arrays.copyOf(b, b.length); 
        b = Arrays.copyOf(a, a.length); 
        a = Arrays.copyOf(c, c.length);
        System.out.print(a[1]);
    }
    
}
