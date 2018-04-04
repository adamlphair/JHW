public class CreatingVariables {
  public static void  main (String[] args) {
    int x, y, age;
    double seconds, e, checking;
    String firstName, lastName, title;
    //int vars
    x = 10;
    y = 400;
    age = 30;

    //double vars
    seconds = 6.5;
    e = 2.71828182845904523536;
    checking = 1.25;

    //String vars
    firstName = "Adam";
    lastName = "Phair";
    title = "Mr.";

    System.out.println("The variable x contains " + x );
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiement took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name is " + title + " " + firstName + " " + lastName);
  }
}
