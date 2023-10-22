import java.util.Scanner;

public class MultipleChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int firstInteger = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int secondInteger = scanner.nextInt();

        scanner.close();

        if (secondInteger != 0 && firstInteger % secondInteger == 0) {
            System.out.println(firstInteger + " is a multiple of " + secondInteger);
        } else {
            System.out.println(firstInteger + " is not a multiple of " + secondInteger);
        }
    }
}
