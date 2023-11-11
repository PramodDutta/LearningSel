package questions;

public class ThrowExample {
    public static void main(String[] args) {
        int age = -5; // Suppose this age is read from user input

        try {
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }

            // Rest of your code
            System.out.println("Age is: " + age);
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid age provided: " + e.getMessage());
        }
    }
}
