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
public class Rohhirim extends Human{
    
    public Rohhirim(int age, String name) {
        super("Рохан", age, 170, name);
    }
    
    public class Hourse{
        private String color;
        private String breed;
        public Hourse(String c, String b){
            this.color = c;
            this.breed = b;
        }
        Rohhirim getOwner(){
            return Rohhirim.this;
        }

    }
}
