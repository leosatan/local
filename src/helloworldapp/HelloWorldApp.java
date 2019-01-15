/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldapp;

/**
 *
 * @author oliversimpson
 */
public class HelloWorldApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Degg Matty = new Degg(); 
        Matty.rank = "silver 4"; 
        Matty.PlayerName = "degg.cs";
        Matty.mmr = 1024; 
        Matty.SmurfStaus = true;  
        
        System.out.println("Hey "+Matty.PlayerName+" you are a "+Matty.rank);
        
       System.out.println("oh oh spaggetti ohs, you won a match");
       Matty.rank = Matty.Rankup(Matty.rank);
       System.out.println("Hey "+Matty.PlayerName+" you are a "+Matty.rank);
    }
    
}
