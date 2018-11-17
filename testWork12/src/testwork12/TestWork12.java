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
public class TestWork12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pet mimi;
        mimi = new Cat();
        System.out.println(mimi.name());
        System.out.println(mimi.voice());
        
        mimi = new Dog();
        System.out.println(mimi.name());
        System.out.println(mimi.voice());
    }
    
}
