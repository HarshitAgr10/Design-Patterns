package adapter;

import adapter.thirdparty.ICICIBankAPI;

// Adapter class for ICICIBankAPI implementing the BankAPIAdapter interface
public class ICICIBankAPIAdapter implements BankAPIAdapter {

    // Reference to an instance of ICICIBankAPI
    private ICICIBankAPI iciciBankAPI = new ICICIBankAPI();

    // Implement the getBalance method by adapting ICICIBankAPI's method
    @Override
    public double getBalance(String accountNumber) {
//        String balance = iciciBankAPI.getBalance();
//        double doubleBalance = Double.parseDouble(balance);
//        return doubleBalance;
        return 0;
    }

    // Implement the sendMoney method by adapting ICICIBankAPI's method
    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
