package observer;

public class Client {
    public static void main(String[] args) {
        // Getting the single instance of Flipkart(subject)
        Flipkart flipkart = Flipkart.getInstance();

        // Creating and registering observers
        EmailSender emailSender = new EmailSender();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        AnalyticsSender analyticsSender = new AnalyticsSender();

        // Simulating an event (order placed) which will notify all observers
        flipkart.orderPlaced();
    }
}


/*
Explanation:-

Flipkart Class (Subject):
Singleton pattern is used to ensure there's only one instance of Flipkart.
Maintains a list of subscribers (orderPlacedSubscribers) who are interested in the order placed event.
Methods to register and unregister subscribers.
When an order is placed (orderPlaced method), all registered subscribers are notified.

OrderPlacedSubscriber Interface:
Defines a method (announceOrderPlaced) that subscribers must implement to handle the order placed event.

OrderCancelledSubscriber Interface:
Defines a method (announceOrderCancelled) for handling the order cancelled event.

EmailSender, AnalyticsSender, InvoiceGenerator (Observers):
Each of these classes implements the OrderPlacedSubscriber interface.
In their constructors, they register themselves with Flipkart.
They implement the announceOrderPlaced method to define their response to the event
(e.g., sending an email, updating analytics, generating an invoice).

Client Class:
Demonstrates the usage of observer pattern by creating instances of the observers and placing an order.
Placing an order triggers notifications to all registered observers, demonstrating the decoupling of
the event source and the event handlers.
 */