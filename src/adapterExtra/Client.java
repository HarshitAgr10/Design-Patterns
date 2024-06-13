package adapterExtra;

// Client class that uses the ITarget interface
public class Client {
    public static void main(String[] args) {
        // Create an instance of the Adapter class
        ITarget iTarget = new Adapter();
        // Call the request method on the adapter instance
        iTarget.request();
    }
}


/*
Explanation:

Client Class:  (PhonePe)
This is the client code that uses the ITarget interface. It doesn't know about the Adaptee class
and interacts only with ITarget.

ITarget Interface:   (BankAPI)
This interface declares the request method that the client expects to use. This is the target interface.

Adaptee Class:   (YesBankAdapter)
This class contains some specific functionality (specificRequest method) that the client needs to use
but cannot directly due to incompatible interfaces.

Adapter Class:   (YesBank)
This class implements the ITarget interface, meaning it provides an implementation for the request method.
It holds an instance of the Adaptee class.
Inside the request method, it calls the specificRequest method of the Adaptee class. This adapts the
Adaptee's interface to the ITarget interface expected by the client.


The Adapter Pattern works as a bridge between the Client and the Adaptee, allowing them to work together
despite their incompatible interfaces. The client interacts with the adapter through the ITarget interface,
while the adapter translates those calls into calls to the Adaptee's methods.
 */