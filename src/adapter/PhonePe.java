package adapter;

// PhonePe class that uses the BankAPIAdapter interface
public class PhonePe {
    // Reference to an object that implements the BankAPIAdapter interface
    private BankAPIAdapter bankAPI;

    public PhonePe(BankAPIAdapter bankAPI) {
        this.bankAPI = bankAPI;
    }

    // Method that perform an operation using the bankAPI
    double doSomething() throws InterruptedException {
        double currentBalance = bankAPI.getBalance("accountNumber");
        Thread.sleep(25 * 24 * 60 * 60 * 1000);    // Sleep for 25 days
        return currentBalance * 2;
    }
}


/*
Explanation:

PhonePe Class:
This class represents a client that uses the BankAPIAdapter interface to perform operations such as
getting the balance and sending money. It doesn't directly interact with specific bank APIs but relies
on the adapter interface.

BankAPIAdapter Interface:
This interface defines the methods that any bank API adapter should implement (getBalance and sendMoney).

YesBankAPIAdapter Class:
This adapter implements the BankAPIAdapter interface and adapts the YesBankAPI methods to match the
BankAPIAdapter interface. It holds a reference to an instance of YesBankAPI.

ICICIBankAPIAdapter Class:
This adapter also implements the BankAPIAdapter interface and adapts the ICICIBankAPI methods to match
the BankAPIAdapter interface. It holds a reference to an instance of ICICIBankAPI.

YesBankAPI Class and ICICIBankAPI Class:
These are hypothetical third-party bank API classes that have their own methods which are different
from BankAPIAdapter interface methods. These classes need to be adapted to work with PhonePe application.

By using this adapter design pattern, the PhonePe application can interact with different bank APIs
through a common interface, making the system flexible and extensible. If a new bank API needs to be
integrated, a new adapter can be created without modifying the existing code.
 */
