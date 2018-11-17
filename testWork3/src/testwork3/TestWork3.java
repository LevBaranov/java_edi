/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testwork3;

import java.util.Scanner;

/**
 * Задание 3
 * @author levbaranov
 */
public class TestWork3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите М или Ж:");
        String val = scan.nextLine();
        String m = "М";
        String f = "Ж";
        String res = (val.equals(m))? "Туалет находится справа" : ((val.equals(f))? "Туалет находится слева" : "Вы ввели что-то не то");
        System.out.print(res);

    }
    
}
