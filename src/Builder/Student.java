package Builder;

import java.sql.SQLException;

public class Student {
    // Private fields for the Student class
    private String name;
    private int age;
    private double psp;
    private String batch;
    private String gradYear;
    private String phone;

    // static nested Builder class
    // Inner class, Allowed to access private methods of outer class
    // Builder class belongs to object of the outer class
    static class Builder {
        // Fields for the Builder class that correspond to the fields of the Student class
        private String name;
        private int age;
        private double psp;
        private String batch;
        private String gradYear;
        private String phone;

        // Getter and setter methods for each field in the Builder class
        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public String getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(String gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhone() {
            return phone;
        }

        public Builder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        // Build method that constructs and returns a Student object
        public Student build() {
            return new Student(this);
        }
    }

    // Private constructor for Student that takes a Builder object
    private Student(Builder builder) {
        // Validating the age field before assigning
        if (builder.getAge() > 100) {
            throw new RuntimeException();
        }

        // Assigning the Builder's fields to the Student's fields
        this.name = builder.getName();
        this.age = builder.getAge();
        this.psp = builder.getPsp();
        this.batch = builder.getBatch();
        this.gradYear = builder.getGradYear();
        this.phone = builder.getPhone();
    }

    // Getter and setter methods for the Student class
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPsp() {
        return psp;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Static method to get a new Builder instance
    public static Builder builder() {
        return new Builder();
    }
}
