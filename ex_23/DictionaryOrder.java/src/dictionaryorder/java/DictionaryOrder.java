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
        //c++
        if (name.compareTo("c++") < 0 )
            System.out.println(name + " comes BEFORE c++"); 
        if (name.compareTo("c++") == 0)
            System.out.println("c++ isn't a made-up language!");
        if (name.compareTo("c++") > 0) 
            System.out.println(name + " comes AFTER c++");
        
        //go
        if (name.compareTo("go") < 0)
            System.out.println(name + " comes BEFORE go");
        if (name.compareTo("go") == 0)
            System.out.println("go isn't a made-up language!");
        if (name.compareTo("go") > 0)
            System.out.println(name + " comes AFTER go");
        
        //java
        if (name.compareTo("java") < 0)
            System.out.println(name + " comes BEFORE java");
        if (name.compareTo("java") == 0)
            System.out.println("java isn't a made-up language!");
        if (name.compareTo("java") > 0)
            System.out.println(name + " comes AFTER java");
        //lisp
        if (name.compareTo("lisp") < 0)
            System.out.println(name + " comes BEFORE lisp");
        if (name.compareTo("lisp") == 0)
            System.out.println("lisp isn't a made-up language!");
        if (name.compareTo("lisp") > 0)
            System.out.println(name + " comes AFTER lisp");
        //python
        if (name.compareTo("python") < 0)
            System.out.println(name + " comes BEFORE python");
        if (name.compareTo("python") == 0)
            System.out.println("python isn't a made-up language!");
        if (name.compareTo("python") > 0)
            System.out.println(name + " comes AFTER python");
        //ruby
        if (name.compareTo("ruby") < 0)
            System.out.println(name + " comes BEFORE ruby");
        if (name.compareTo("ruby") == 0)
            System.out.println("ruby isn't a made-up language!");
        if (name.compareTo("ruby") > 0)
            System.out.println(name + " comes AFTER ruby");
        //visualbasic
        if (name.compareTo("visualbasic") < 0)
            System.out.println(name + " comes BEFORE visualbasic");
        if (name.compareTo("visualbasic") == 0)
            System.out.println("visualbasic isn't a made-up language!");
        if (name.compareTo("visualbasic") > 0)
            System.out.println(name + " comes AFTER visualbasic");
    }
    
}
