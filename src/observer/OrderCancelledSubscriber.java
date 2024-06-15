package observer;

// Observer interface for subscribers interested in order cancelled events
public interface OrderCancelledSubscriber {
    void announceOrderCancelled();
}
