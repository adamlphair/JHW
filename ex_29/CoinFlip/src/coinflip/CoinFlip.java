package coinflip;
import java.util.Scanner;
/**
 *
 * @author adamphair
 */
public class CoinFlip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); 
        String coin, again;
        int streak = 0;
        boolean gotHeads;
        
        do {
            gotHeads = Math.random() < 0.5;
            
            if (gotHeads) 
                coin = "Heads";
            else
                coin = "Tails";
            
            System.out.println("You flip a coin and it is ...."  + coin);
            
            if (gotHeads) {
                streak++; 
                System.out.println("\tThat's " + streak + " in a row!");
                System.out.print("Would yo ulike to flip again (y/n)?");
                again = keyboard.next();
            }
            
            else {
                System.out.println("\tYou lose everything!");
                System.out.println("\tShould've quit while you were aHEAD.....");
                streak = 0; 
                again = "n"; 
            } 
        }   while (again.equals("y")); 
            
            System.out.println("Final Score: " + streak);
    }
    
}
