package builder;

public class Client {
    public static void main(String[] args) {
        // Builder builder = new Builder();
        // Builder builder = Student.builder();
        // builder.setName("abc");
        // builder.setBatch("beg");

        // Student student = new Student(builder);

        // Passing responsibility of creating new object of student class to build()
        // Student student = builder.build();

        // Using the builder to create a Student object
        Student student = Student
                .builder()         // Get a new Builder instance
                .setName("xyz")    // Set the name field
                .setAge(20)        // Set the age field
                .setPsp(20.2)      // Set the psp field
                .build();          // Build the Student object

        System.out.println("DEBUG");
    }
}


/*
Explanation:-

Builder Class:
The Builder class is a static nested class inside the Student class. It contains the same fields
as the Student class and provides setter methods for these fields.
Each setter method in the Builder class returns the Builder object itself (this), allowing for
method chaining.

Build Method:
The build() method in the Builder class creates an instance of Student by calling its private
constructor and passing this (the Builder instance).

Student Constructor:
The Student class has a private constructor that takes a Builder object. It assigns the builder's
fields to the student's fields. It also includes a validation check for the age field.

Client Class:
The Client class demonstrates the use of the builder to create a Student object. It calls the
builder() method to get a new Builder instance and then sets the fields using the setter methods.
Finally, it calls build() to create the Student object.
This design pattern ensures that the Student object is constructed in a controlled manner and
is immutable once created, providing clarity and flexibility in object construction.
 */
