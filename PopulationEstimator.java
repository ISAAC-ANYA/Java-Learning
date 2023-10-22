import java.util.Scanner;

public class PopulationEstimator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the current world population: ");
        long currentPopulation = scanner.nextLong();


        System.out.print("Enter the annual population growth rate (as a decimal): ");
        double growthRate = scanner.nextDouble();


        System.out.println("Estimated Population Growth:");
        for (int years = 1; years <= 5; years++) {
            currentPopulation *= growthRate;
            System.out.println("Year " + years + ": " + currentPopulation);
        }

        scanner.close();
    }
}
