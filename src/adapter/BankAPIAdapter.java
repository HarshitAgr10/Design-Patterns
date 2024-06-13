package adapter;

// Interface that defines the methods required for a bank API adapter
public interface BankAPIAdapter {
    double getBalance(String accountNumber);
    boolean sendMoney(String fromAccount, String toAccount, double amount);
}
