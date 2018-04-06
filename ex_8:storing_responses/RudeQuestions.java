import  java.util.Scanner;

public class RudeQuestions {
  public static void main (String[] args ) {
    String name;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Hello. What is your name?");
    name = keyboard.next();

    System.out.println ("Hi, " + name + "! How old are you?");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.println("How much do you weigh, " + name + "?");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.println("Finally, what's your income?");
    income = keyboard.nextDouble();

    System.out.println("Hopefully that is "  + income + " per hour!");
    System.out.println("and not per year!");
    System.out.println("Well, thanks for answering my rude questions, " + name + ".");

  }

}
