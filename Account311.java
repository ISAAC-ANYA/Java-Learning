public class Account311 {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0.0) {
            balance = initialBalance;
        }
    }

    public void deposit(double depositAmount) {
        if (depositAmount > 0.0) {
            balance += depositAmount;
        }
    }

    public void withdraw(double withdrawalAmount) {
        if (withdrawalAmount > 0.0) {
            if (withdrawalAmount <= balance) {
                balance -= withdrawalAmount;
            } else {
                System.out.println("Withdrawal amount exceeded account balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}