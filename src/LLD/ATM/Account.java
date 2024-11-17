package LLD.ATM;

public class Account {
    private double balance;
    private AccountType accountType;

    public Account(double balance, AccountType accountType) {
        this.balance = balance;
        this.accountType = accountType;
    }

    boolean deposit(double amount) {
        double newAmount = balance + amount;
        System.out.println("Deposited Rs " + amount + " successfully in account");
        balance = newAmount;
        return true;
    }

    boolean withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Cannot withdraw more amount than balance");
            return false;
        }
        balance -= amount;
        System.out.println("Withdrawl amount Rs " + amount + " scuccessfully from account");
        return true;
    }

    double getBalance() {
        return balance;
    }
}
