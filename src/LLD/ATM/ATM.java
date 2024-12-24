package LLD.ATM;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ATM {
    private double availableFunds;
    private List<Transaction> transactionHistory = new ArrayList<>();

    public void setAvailableFunds(double availableFunds) {
        this.availableFunds = availableFunds;
    }

    // Authenticate the card using its PIN
    boolean authenticateCard(Card card, String enteredPin) {
        return card.validatePin(enteredPin);
    }

    // Withdraw money from the ATM and account
    boolean withdraw(double amount, Card card) {
        if (amount > availableFunds) {
            System.out.println("ATM does not have enough funds.");
            return false;
        }

        Account account = card.getBankAccount();
        if (account.withdraw(amount)) {
            availableFunds -= amount; // Deduct from ATM funds
            transactionHistory.add(new Transaction("T - " + LocalDateTime.now(), LocalDateTime.now(), amount,
                    TransactionType.WITHDRAW));
            return true;
        } else {
            System.out.println("Insufficient balance in account.");
            return false;
        }
    }

    // Deposit money into the account and ATM
    boolean deposit(double amount, Card card) {
        Account account = card.getBankAccount();
        if (account.deposit(amount)) {
            availableFunds += amount; // Add to ATM funds
            transactionHistory.add(
                    new Transaction("T - " + LocalDate.now(), LocalDateTime.now(), amount, TransactionType.DEPOSIT));
            return true;
        }
        return false;
    }

    // Check the balance of the account linked to the card
    void checkBalance(Card card) {
        transactionHistory.add(
                new Transaction("T - " + LocalDateTime.now(), LocalDateTime.now(), 0, TransactionType.BANK_BALANCE));
        System.out.println("Balance : Rs " + card.getBankAccount().getBalance());
    }

    // Display the transaction history
    void viewTransactionHistory() {
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions to display.");
        } else {
            System.out.println("Transaction History:");
            for (Transaction transaction : transactionHistory) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                String history = String.format("Transaction ID: %s, Date: %s, Amount: %.2f, Type: %s",
                transaction.getId(), transaction.getDate().format(formatter), transaction.getAmount(), transaction.getType());
                System.out.println(history);
            }
        }
    }
}