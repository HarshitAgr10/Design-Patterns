package adapter;

import adapter.thirdparty.YesBankAPI;

// Adapter class for YesBankAPI implementing the BankAPIAdapter interface
public class YesBankAPIAdapter implements BankAPIAdapter {

    // Reference to an instance of YesBankAPI
    private YesBankAPI yesBankAPI = new YesBankAPI();

    // Implement the getBalance method by adapting YesBankAPI's method
    @Override
    public double getBalance(String accountNumber) {
        // yesBankAPI.fetchBalance();
        return 0;
    }

    // Implement the sendMoney method by adapting YesBankAPI's method
    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
