import java.util.Scanner;
public class AddDivide {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	int number1;
	int number2;
	int number;
	int sum;
	int result;	

	System.out.print("Enter first integer:");
	int number1 = input.nextInt();

	System.out.print("Enter second integer:");
	int number2 = input.nextInt();

	System.out.print("Enter third integer:");
	int number3 = input.nextInt();

	sum = number1 + number2;

	result = sum/number3;

	System.out.printf("The sum of number1 and number2 is:" + sum);

	System.out.printf("The result of the division:" + result);

	}
}
