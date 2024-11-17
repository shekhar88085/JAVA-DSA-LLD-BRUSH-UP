package LLD.ATM;

public class Card {
    private String pin;
    private String cardNumber;
    private Account account;
    public Card(String pin, String cardNumber, Account account) {
        this.pin = pin;
        this.cardNumber = cardNumber;
        this.account = account;
    }
    
    boolean validatePin(String pin){
        if(this.pin == pin){
            System.out.println("Correct PIN");
            return true;
        } else {
            System.out.println("Incorrect PIN");
            return false;
        }
    }

    Account getBankAccount(){
        return account;
    }
}
