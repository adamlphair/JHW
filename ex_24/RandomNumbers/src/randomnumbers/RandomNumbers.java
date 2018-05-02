/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;

/**
 *
 * @author adamphair
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, c, d;
        double r, rps; 
        
        rps = Math.random();
        if (rps < 0.3333) {
            System.out.println("ROCK");
        }
    }
    
}
