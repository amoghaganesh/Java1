package examples;

public class ThrowExample {
    public static void main(String[] args) {
        checkAge(15);  // This will throw an exception and stop the program
        System.out.println("This line will not be executed if exception is thrown");
    }

    // Throwing an unchecked exception manually
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older");
        }
        System.out.println("Valid age");
    }
}

