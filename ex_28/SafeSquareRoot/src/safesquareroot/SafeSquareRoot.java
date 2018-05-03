package safesquareroot;
import java.util.Scanner;
/**
 *
 * @author adamphair
 */
public class SafeSquareRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double x, y;
        
        System.out.print("Give me a number, and I will find it's square root. ");
        System.out.print("(No negatives, please.)");
        x = keyboard.nextDouble();
        
        while (x < 0) {
            System.out.println("I won't take the square root of a negative.");
            System.out.println("\nNew number:");
            x = keyboard.nextDouble();
        }
        
        y = Math.sqrt(x);
        
        System.out.println("The square root of " + x + " is " + y);
    }
    
}
