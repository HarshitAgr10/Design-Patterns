package strategy;

// Context class that uses a payment strategy
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Set the payment strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Use the strategy to pay the amount
    public void pay(double amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment strategy set.");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
