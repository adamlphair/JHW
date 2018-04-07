import java.util.Scanner;

public class BMICalculator {
  public static void main (String[] args ) {

    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, bmi2, lbs, inches;

    System.out.println ("Your height in meters: ");
    m = keyboard.nextDouble();
    inches = m * 0.0254;
    System.out.println("Your weight in kg: ");
    kg = keyboard.nextDouble();
    lbs = kg * 0.453592;

    bmi = kg / (m * m);
    bmi2 = (lbs / (inches * inches) * 703);

    // System.out.println ("Your BMI is " + bmi);

    System.out.println ("Your BMI is " + bmi);
  }

}
