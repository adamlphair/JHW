/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner; 

/**
 *
 * @author adamphair
 */
public class DictionaryOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in); 
        String name; 
        
        System.out.print("Make up the name of a programming language!");
        name = keyboard.nextLine();
        
        if (name.compareTo("c++") < 0 )
            System.out.println(name + " comes BEFORE c++"); 
        
    }
    
}
