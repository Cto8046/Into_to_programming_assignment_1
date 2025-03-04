//This is a program that finds perfect numbers within a users given range


import java.util.Scanner;

public class Main {

    // Method to check for perfect numbers
    public static void Main(long limit) {
        System.out.println("Checking for perfect numbers up to " + limit + "...");

        for (long num = 1; num <= limit; num++) {
            long sum = 0; // reset sum each time

            // Loop to find divisors
            for (long i = 1; i <= num / 2; i++) {
                if (num % i == 0) { // if it's a divisor
                    sum += i; // add it to sum
                }
            }

            public static class UserInputting {
            }
            public void UserInputting(String[] args) {
                Scanner scanner = new Scanner(System.in); // scanner obj to read input
                long upperLimit = 0;

                // Loop to keep asking until user enters a valid number
                while (true) {
                    System.out.print("Enter a number: ");

                    if (scanner.hasNextLong()) { // check if input is a number
                        upperLimit = scanner.nextLong(); // store number
                        break; // exit loop
                    } else {
                        System.out.println("Nope, enter a number please."); // error msg
                        scanner.next(); // clear bad input
                    }
                }

                scanner.close();
            }

            // If sum of divisors = number, it's perfect
            if (sum == num) {
                System.out.println(num + " is perfect!");
            }
        }
    }
}
