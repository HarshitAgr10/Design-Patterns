package adapterExtra;

// Adaptee class with a specificRequest method that needs to be adpated
public class Adaptee {
    // Method that has specific functionality which needs to be adapted
    public void specificRequest() {
        System.out.println("Called from Adaptee");
    }
}
