package LLD.ATM;

import java.time.LocalDateTime;

public class Transaction {
    private String id;
    private LocalDateTime date;
    private double amount;
    private TransactionType type;

    public Transaction(String id, LocalDateTime date, double amount, TransactionType type) {
        this.id = id;
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public TransactionType getType() {
        return type;
    }

    
}