import java.util.Scanner;
public class SLI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		int number3;
		int number4;
		int number5;
		int smallest;
		int largest;
		
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		System.out.print("Enter third integer: ");
		number3 = input.nextInt();

		System.out.print("Enter fourth integer: ");
		number4 = input.nextInt();

		System.out.print("Enter fifth integer: ");
		number5 = input.nextInt();
		
	if (number1 > largest)
            largest = number1;
	if (number2 > largest)
            largest = number2;
        if (number3 > largest)
            largest = number3;
        if (number4 > largest)
            largest = number4;
        if (number5 > largest)
            largest = number5;

        if (number1 < smallest)
            largest = number1;
        if (number2 < smallest)
            largest = number2;
        if (number3 < smallest)
            largest = number3;
        if (number4 < smallest)
            largest = number4;
        if (number5 < smallest)
            largest = number5;

        System.out.printf("Largest of five integers is %d, and smallest is %d%n", largest, smallest);
	}
}
