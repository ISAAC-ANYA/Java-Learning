public class AccountTest311 {
    public static void main(String[] args) {
        Account account1 = new Account(1000.0);
        Account account2 = new Account(500.0);

        System.out.println("Initial balances:");
        System.out.printf("Account 1 balance: $%.2f%n", account1.getBalance());
        System.out.printf("Account 2 balance: $%.2f%n%n", account2.getBalance());

        account1.withdraw(200.0);
        System.out.println("After withdrawing $200 from account 1:");
        System.out.printf("Account 1 balance: $%.2f%n%n", account1.getBalance());

        account2.withdraw(700.0);
        System.out.println("After attempting to withdraw $700 from account 2:");
        System.out.printf("Account 2 balance: $%.2f%n", account2.getBalance());

        account2.withdraw(-50.0);
    }
}