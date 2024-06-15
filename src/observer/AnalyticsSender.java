package observer;

// Concrete observer that updates analytics when an order is placed or cancelled
public class AnalyticsSender implements OrderPlacedSubscriber, OrderCancelledSubscriber {

    public AnalyticsSender() {
        // Registering this observer with the subject
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    // Implementation of the notification method for order placed
    @Override
    public ReturnData announceOrderPlaced() {
        System.out.println("Updating Analytics");
        return null;
    }

    // Implementation of the notification method for order cancelled
    @Override
    public void announceOrderCancelled() {
        System.out.println("Oder Cancelled");
    }
}
