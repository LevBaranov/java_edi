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
public class TestWork13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pet mimi;
        mimi = new Cat();
        mimi.name();
        System.out.println(mimi.voice());
        
        mimi = new Dog();
        mimi.name();
        System.out.println(mimi.voice());
    }
    
}
