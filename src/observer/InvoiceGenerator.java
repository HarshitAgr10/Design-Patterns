package observer;

// Concrete observer that generates an invoice when an order is placed
public class InvoiceGenerator implements OrderPlacedSubscriber {
    public InvoiceGenerator() {
        // Registering this observer with the subject
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }

    // Implementation of the notification method
    @Override
    public ReturnData announceOrderPlaced() {
        generateInvoice();
        return null;
    }

    // Method to generate an invoice
    public void generateInvoice() {
        System.out.println("Generating Invoice");
    }
}
