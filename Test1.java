import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int x;
		int y;
		int z;
		int result;
		
		System.out.print("Enter first integer: ");
		x = input.nextInt();

		System.out.print("Enter second integer: ");
		y = input.nextInt();

		System.out.print("Enter third integer: ");
		z = input.nextInt();

		result = x + y + z;
		
		System.out.printf("result is %d%n", result);

	}
}
