package examples;

public class UncheckedExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        // This line will throw an unchecked exception (ArrayIndexOutOfBoundsException) at runtime
        System.out.println("Number at index 5: " + numbers[5]);
    }
}

