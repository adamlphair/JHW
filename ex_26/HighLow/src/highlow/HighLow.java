/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package highlow;
import com.sun.org.apache.xml.internal.utils.SystemIDResolver;
import java.util.Scanner;
/**
 *
 * @author adamphair
 */
public class HighLow {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        int secret, guess; 
        
        secret = 1 + (int)(100*Math.random());
        System.out.println("I am thinking of a number between 1-100.");
        System.out.println("Try to guess it!");
        System.out.print("> ");
        guess = keyboard.nextInt();
        
        while (secret != guess) {            
            if (guess < secret) {
                System.out.print("Sorry your guess is too low. ");
                System.out.print("Try again.\n>");
                guess = keyboard.nextInt();
            }
            if (guess > secret){
                System.out.print("Sorry, your guess is too high.");
                System.out.print(" Try again\n> ");
                guess = keyboard.nextInt();
            }
        }    
         
        System.out.println("You guessed it! What are the odds?!?");
      
    }
    
}
