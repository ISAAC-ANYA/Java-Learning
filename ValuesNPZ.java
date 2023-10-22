import java.util.Scanner;

public class ValuesNPZ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter number " + i + ": ");
            int number = scanner.nextInt();

            if (number < 0) {
                negativeCount++;
            } else if (number > 0) {
                positiveCount++;
            } else {
                zeroCount++;
            }
        }

        scanner.close();

        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of zeros: " + zeroCount);
    }
}
This program uses a for loop to iterate through five numbers entered by the user. It counts the number of negative numbers, positive numbers, and zeros entered and then prints the results.






