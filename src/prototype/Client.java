package prototype;

public class Client {

    // Method to populate the registry with dummy data
    public static void populateRegistryDummy(StudentRegistry studentRegistry) {
        // Create Student prototype
        Student apr23BatchPrototype = new Student();
        apr23BatchPrototype.setBatchName("Apr 23 Beg Java Batch");
        apr23BatchPrototype.setAvgBatchPsp(90.0);

        // Register the Student prototype
        studentRegistry.register("apr23Beg", apr23BatchPrototype);

        IntelligentStudent may24ISPrototype = new IntelligentStudent();
        may24ISPrototype.setBatchName("May 24 Beg Intelligent Student batch");
        may24ISPrototype.setAvgBatchPsp(99.0);

        // Register the IntelligentStudent prototype
        studentRegistry.register("may24IS", may24ISPrototype);
    }


    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        populateRegistryDummy(studentRegistry);

        // A new Student joins named "abc" with age 25 and psp 10
        Student abc = studentRegistry.get("apr23Beg").clone();
        abc.setName("Abc");
        abc.setAge(25);
        abc.setPsp(10.0);

        // A new Student joins named "abc" with age 25 and psp 10
        Student xyz = studentRegistry.get("may24IS").clone();
        abc.setName("Xyz");
        abc.setAge(22);
        abc.setPsp(50.0);

        System.out.println("DEBUG");
    }
}

/*
Prototype Interface
The Prototype interface declares a clone method, which all implementing classes must define.
The generic type T ensures that the clone method returns an instance of the correct type.

Concrete Prototype: Student Class
Attributes: The Student class has attributes like name, age, psp, batchName, avgBatchPsp, and count.
Default Constructor: Initializes a new Student object with default values.
Copy Constructor: Initializes a new Student object by copying the values from another Student object.
Clone Method: Implements the clone method from the Prototype interface using the copy constructor.

Concrete Prototype: IntelligentStudent Class
Attributes: Inherits all attributes from Student and adds a new attribute iq.
Default Constructor: Initializes a new IntelligentStudent object with default values.
Copy Constructor: Initializes a new IntelligentStudent object by copying the values from
another IntelligentStudent object.
Clone Method: Implements the clone method using the copy constructor.

Student Registry
Attributes: Maintains a map of prototype students identified by a unique key.
Register Method: Adds a student prototype to the registry.
Get Method: Retrieves a student prototype from the registry.

Client Class
populateRegistryDummy Method: Populates the student registry with prototype instances.
main Method:
Creates an instance of StudentRegistry.
Populates the registry with dummy data.
Clones a Student prototype, customizes it with specific details, and creates a new student named "Abc".
Clones an IntelligentStudent prototype, customizes it with specific details, and creates a new student named "Xyz".
 */
