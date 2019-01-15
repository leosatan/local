package helloworldapp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oliversimpson
 */
public class Degg {
   
    String PlayerName;
    String rank; 
    int mmr;
    boolean SmurfStaus;  
            
    
    public String Rankup (String rank)
    {
        if (rank == "silver 4")
                {
                    rank = "LEM";
                }
                
        return rank;
    }
}

