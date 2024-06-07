package Singleton;

import java.util.concurrent.locks.ReentrantLock;

// Multithreaded code for Singleton (Double Locking) (Lazy Initialization)
public class DatabaseConnection {
    
    private static DatabaseConnection instance;

    // Reentrant lock for explicit locking
    private static ReentrantLock lock = new ReentrantLock();

    // Private constructor to restrict instantiation from other classes
    private DatabaseConnection() {

    }

    // Public method to provide access to singleton instance
    public static DatabaseConnection getInstance() {
        if (instance == null) {    // First check (without locking) to improve performance
            lock.lock();   // Acquire the lock before entering the critical section
            try {
                // Second check (with locking) to ensure only one thread initializes the instance
                if (instance == null) {
                    instance = new DatabaseConnection();
                }
            } finally {
                lock.unlock();   // Ensure the lock is released even if an exception occurs
            }
        }
        return instance;   // Return the singleton instance
    }

        // Example method to demonstrate the usage of the singleton
        public void showMessage() {
            System.out.println("Hello World!");
    }
}
