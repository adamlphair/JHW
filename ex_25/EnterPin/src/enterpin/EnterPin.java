/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enterpin;
import java.util.Scanner;

/**
 *
 * @author adamphair
 */
public class EnterPin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int pin, entry;
        
        pin = 12345;
        
        System.out.println("WELCOME TO THE BANK OF JAVA");
        System.out.println("ENTER YOUR PIN: ");
        entry = keyboard.nextInt();
        
        while (entry != pin) {            
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.println("ENTER YOUR PIN: ");
            entry = keyboard.nextInt(); 

        }
          
        System.out.println("\nPIN ACCEPTED.  YOUR ACCOUNT BALANCE IS $425.17");
        }
    }
    
