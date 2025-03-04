//This is a program used for finding perfect numbers based on user input

import java.util.Scanner;

public class Main {

    // Method to check for perfect numbers
    public static void findPerfectNumbers(long limit) {
        System.out.println("Checking for perfect numbers up to " + limit + "...");

        for (long num = 1; num <= limit; num++) {
            long sum = 0; // reset sum each time

            // Loop to find divisors
            for (long i = 1; i <= num / 2; i++) {
                if (num % i == 0) { // if it's a divisor
                    sum += i; // add it to sum
                }
            }

            // If sum of divisors = number, it's perfect
            if (sum == num) {
                System.out.println(num + " is perfect!");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object to read input
        long upperLimit;

        // Loop to keep asking until the user enters a valid number
        while (true) {
            System.out.print("Enter a number: ");

            if (scanner.hasNextLong()) { // Check if input is a number
                upperLimit = scanner.nextLong(); // Store number
                break; // Exit loop
            } else {
                System.out.println("Nope, enter a number please."); // Error message
                scanner.next(); // Clear bad input
            }
        }

        scanner.close();

        // Call method to find perfect numbers
        findPerfectNumbers(upperLimit);
    }
}
