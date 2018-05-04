/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirtydaysfunction;
import com.sun.org.apache.xalan.internal.lib.ExsltDatetime;
import java.util.Scanner;
/**
 *
 * contains functions that make it easier to work with months
 */
public class ThirtyDaysFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in); 
       
        System.out.print("Which month? (1-12) ");
        int month = kb.nextInt();
        
        System.out.println(monthDays(month) + " days hath " + monthName(month));
  
    }
    
    /**
     * Returns the name for the given month number (1-12).
     * 
     * @author  Adam Phair
     * @param month the month number (1-12)
     * @return      The English name of the month, or "error" if out of range
     */
    public static String monthName (int month) {
        String monthName = "error"; 
        
        switch (month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12: 
                monthName = "December";
                break;
            default:
                break;
        }
        
        return monthName;
    }
    
    /**
     * Returns the number of days in a given month
     * 
     * @author Adam Phair
     * @param month the month number (1-12)
     * @return      the number of days in the month, or 31 if out of range
     */
    public static int monthDays (int month) {
        int days;
        
        /* Thirty days hath September
            April, June, and Novemeber
            All the rest have thirty-one
            Except the second month alone...
        */
        
        switch(month)
        {
            case 9:
            case 4:
            case 6:    
            case 11: days = 30;
                     break; 
            case 2: days = 28;
                    break;
            default: days = 31;
        }
        
        return days; 
    }
}
