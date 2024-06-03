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
