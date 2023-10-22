import java.util.Scanner;

public class DailyDrivingCostCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total miles driven per day: ");
        double milesDrivenPerDay = scanner.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: NGN");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Enter parking fees per day: NGN");
        double parkingFeesPerDay = scanner.nextDouble();

        System.out.print("Enter tolls per day: NGN");
        double tollsPerDay = scanner.nextDouble();

        scanner.close();

        double costPerDay = (milesDrivenPerDay / milesPerGallon) * costPerGallon + parkingFeesPerDay + tollsPerDay;

        System.out.println("Your daily driving cost is: NGN" + costPerDay);
    }
}