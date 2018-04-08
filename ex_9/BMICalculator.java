import java.util.Scanner;

public class BMICalculator {
  public static void main (String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, bmi2, lbs, inches, totalHeight;
    int feet;

    System.out.println ("Your height(feet only): ");
    feet = keyboard.nextInt();
    System.out.println("Your height(inches only): ");
    inches = keyboard.nextDouble();
    System.out.println("Your weight in lbs: ");
    lbs = keyboard.nextDouble();

    //convert imperial to metric
    totalHeight = (feet * 12) + inches;

    m = totalHeight * .0254;
    kg = lbs * 0.453592;
    
    bmi = kg / (m * m);

    // System.out.println ("Your BMI is " + bmi);
    System.out.println ("Your BMI is " + bmi);
  }

}
