/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirtydays;
import java.util.Scanner;

/**
 *
 * @author adamphair
 */
public class ThirtyDays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in); 
        int month, days;
        String monthName;
        
        System.out.print("Which month? (1-12) ");
        month = keyboard.nextInt(); 
        
        switch(month) {
            case 1 : monthName = "January"; 
                break; 
            case 2 : monthName = "February"; 
                break;
            case 3 : monthName = "March"; 
                break;
            case 4 : monthName = "April"; 
                break;   
        }
    }
    
}
