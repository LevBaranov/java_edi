/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork5;

/**
 *Задание 5
 * @author levbaranov
 */
public class TestWork5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print(factorial(3));
    }
    static int factorial(int n){
        if (n == 1) {
            return 1;
        }
        // Шаг рекурсии / рекурсивное условие
        return factorial(n - 1) * n;
    }
    
}
