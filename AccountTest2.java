public class AccountTest
{
	public static void main(String[] args)
	{
		Account account1 = new Account("Isaac Anya", 50.00);
		Account account1 = new Account("Jacklyn Okoye", -7.53);

		System.out.printf("%s balance: $%.2f%n",
			account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
			account2.getName(), account2.getBalance());

		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter deposit amount for account1: ");
		double depositAmount = inpt.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n",
			depositAmount);
		account1.deposit(depositAmount);
	
		System.out.printf("%s balance: $%.2f%n",
			account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
			account2.getName(), account2.getBalance());

			System.out.printf("Enter deposit amount for account2: ");
		double depositAmount = inpt.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n",
			depositAmount);
		account2.deposit(depositAmount);	

		System.out.printf("%s balance: $%.2f%n",
			account1.getName(), account1.getBalance());
		System.out.printf("%s balance: $%.2f%n%n",
			account2.getName(), account2.getBalance());
		
		}
}