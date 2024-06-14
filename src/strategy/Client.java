package strategy;

public class Client {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Pay using Credit Card
        paymentContext.setPaymentStrategy(new CreditCardPayment("1234567890123456",
                "abc", "123", "12/25"));
        paymentContext.pay(100.0);

        // Pay using PayPal
        paymentContext.setPaymentStrategy(new PayPalPayment("abc@example.com", "password"));
        paymentContext.pay(200.0);

        // Pay using Google Wallet
        paymentContext.setPaymentStrategy(new GoogleWalletPayment(123));
        paymentContext.pay(300.0);
    }
}


/*
Explanation:

PaymentStrategy Interface:
This interface defines a pay method that all concrete payment strategies must implement.

Concrete Strategies:
These classes (CreditCardPayment, PayPalPayment, GoogleWalletPayment) implement the PaymentStrategy
interface and provide specific implementations for the pay method.

PaymentContext Class:
This class uses a PaymentStrategy to process payments. It has a method setPaymentStrategy to set the
strategy at runtime and a pay method that delegates the payment process to the current strategy.

Client:
This is client code that demonstrates how to use the PaymentContext with different payment strategies.
 */