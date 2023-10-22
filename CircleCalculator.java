import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the radius of the circle (integer): ");
        int radius = scanner.nextInt();
x

        scanner.close();


        double PI = 3.14159;


        double diameter = 2 * radius;
        double circumference = 2 * PI * radius;
        double area = PI * radius * radius;

        System.out.println("Diameter: " + diameter);
        System.out.println("Circumference: " + circumference);
        System.out.println("Area: " + area);
    }
}
