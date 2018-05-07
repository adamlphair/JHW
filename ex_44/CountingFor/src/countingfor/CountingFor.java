/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countingfor;
import java.util.Scanner;
/**
 *
 * @author adamphair
 */
public class CountingFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        int n;
        String message;
        
        System.out.println("Enter a message and I'll display it five times.");
        System.out.print("Message: ");
        message = keyboard.nextLine();
        
        for (int x = 1; x <= 5; x++) {
            System.out.println(x + ". " + message);
        }
        
        System.out.println("\nNow I'll show you it ten times and count by 5s.");
        for (int i = 5; i <= 50; i+=5) {
            System.out.println(i + ". " + message);
        }
        
        System.out.println("\nFinally, three times counting backwards.");
        for (int i = 3; i > 0; i--) {
            System.out.println(i + ". " + message);

        }
    }
    
}
