import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightPounds = scanner.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInches = scanner.nextDouble();

        scanner.close();


        double bmi = (weightPounds / (heightInches * heightInches)) * 703.0;

        System.out.println("Your Body Mass Index (BMI) is: " + bmi);


        System.out.println("BMI Categories from the Department of Health and Human Services/National Institutes of Health:");
        System.out.println("Underweight: Less than 18.5");
        System.out.println("Normal weight: 18.5 - 24.9");
        System.out.println("Overweight: 25 - 29.9");
        System.out.println("Obesity - Class I: 30 - 34.9");
        System.out.println("Obesity - Class II: 35 - 39.9");
        System.out.println("Obesity - Class III (Morbid Obesity): 40 or greater");
    }
}