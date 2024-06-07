package Singleton;

public class Client {
    public static void main(String[] args) {
        // Get the singleton instance
        DatabaseConnection singleton1 = DatabaseConnection.getInstance();
        DatabaseConnection singleton2 = DatabaseConnection.getInstance();

        // Check if both references point to the same instance
        System.out.println(singleton1 == singleton2);   // O/P :- true

        singleton1.showMessage();   // O/P:- Hello World!
    }
}


/*
Explanation:-

ReentrantLock:
The lock object is an instance of ReentrantLock, which provides explicit locking mechanisms.

Private Constructor:
The constructor is private to prevent instantiation from other classes, ensuring that only one
instance of the class can exist.

getInstance Method:
First Check (without locking): The method first checks if the instance is null without acquiring
the lock. This check improves performance by avoiding the overhead of locking when the instance
is already initialized.
Acquire Lock: If the instance is null, the method acquires the lock using lock.lock().
Second Check (with locking): Inside the synchronized block, a second check ensures that only one
thread initializes the instance.
Finally Block: The lock is released in a finally block to ensure it is always released, even if
an exception occurs.

showMessage Method:
A simple method to demonstrate the functionality of the Singleton instance.

Main Class:
Demonstrates how to use the Singleton by calling getInstance() and verifying that multiple calls
return the same instance.
This implementation is thread-safe and efficient, ensuring that the Singleton instance is lazily
initialized in a multi-threaded environment.
 */