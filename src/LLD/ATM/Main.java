package LLD.ATM;

public class Main {
    public static void main(String[] args) {
        ATM pnbATM = new ATM();
        pnbATM.setAvailableFunds(10000);
        Account pnbAccount = new Account(4000, AccountType.SAVING);
        Card pnbCard = new Card("1111", "1234 5678 9876 5432", pnbAccount);
        pnbATM.checkBalance(pnbCard);
        pnbATM.withdraw(1000, pnbCard);
        pnbATM.deposit(9, pnbCard);
        pnbATM.withdraw(100000, pnbCard);
        pnbATM.viewTransactionHistory();
    }
}
