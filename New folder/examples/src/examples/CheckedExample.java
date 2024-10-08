package examples;

import java.util.Scanner;

public class CheckedExample {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int number = scanner.nextInt();

        System.out.println("Pausing for " + number + " seconds...");

        // Checked exception: InterruptedException (thrown by Thread.sleep)
        Thread.sleep(number * 1000);  // Must declare or handle the exception
        System.out.println("Waited " + number + " seconds");
    }
}
