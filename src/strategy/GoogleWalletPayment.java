package strategy;

// Concrete strategy for Google Wallet payment
public class GoogleWalletPayment implements PaymentStrategy {
    private int pin;

    public GoogleWalletPayment(int pin) {
        this.pin = pin;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Paid: " + amount + " using Google Wallet.");
    }
}
