package observer;

import java.util.List;
import java.util.ArrayList;

// Singleton Class representing the subject(publisher) that will notify observers(subscribers) about changes
public class Flipkart {
    private static Flipkart instance;
    private List<OrderPlacedSubscriber> orderPlacedSubscribers = new ArrayList<>();

    // Private constructor to prevent instantiation
    private Flipkart() {

    }

    // Ensures that only one instance of Flipkart exists (Singleton Pattern)
    public static Flipkart getInstance() {
        if (instance == null) {
            instance = new Flipkart();
        }
        return instance;
    }

    // Method to register a new subscriber(observer)
    void registerSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.add(orderPlacedSubscriber);
    }

    // Method to unregister an existing subscriber(observer)
    void unregisterSubscriber(OrderPlacedSubscriber orderPlacedSubscriber) {
        orderPlacedSubscribers.remove(orderPlacedSubscriber);
    }

    // Method to notify all registered subscribers when an order is placed
    public void orderPlaced() {
        for (OrderPlacedSubscriber orderPlacedSubscriber : orderPlacedSubscribers) {
            orderPlacedSubscriber.announceOrderPlaced();
        }
    }
}
