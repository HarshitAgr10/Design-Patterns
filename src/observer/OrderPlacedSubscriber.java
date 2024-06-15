package observer;

// Observer interface for subscribers interested in order placed events
public interface OrderPlacedSubscriber {
    ReturnData announceOrderPlaced();
}
