package adapterExtra;

// Adapter class that implements the iTarget interface
public class Adapter implements ITarget {
    // Create an interface of the Adaptee class
    private Adaptee adaptee = new Adaptee();

    // Implement the request method from the ITarget interface
    @Override
    public void request() {
        // Call the specificRequest method on the adaptee instance
        adaptee.specificRequest();
    }
}
