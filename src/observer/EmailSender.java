package observer;

// Concrete observer that sends email when an order is placed
public class EmailSender implements OrderPlacedSubscriber {

    public EmailSender() {
        // Registering this observer with the subject
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    // Implementation of notification method
    @Override
    public ReturnData announceOrderPlaced() {
        sendEmail();
        return null;
    }

    // Method to send an email
    public void sendEmail() {
        System.out.println("Sending Email");
    }
}
