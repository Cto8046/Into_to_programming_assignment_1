import java.util.Scanner; // for user input

class findPerfectNumbers {
    public static void main(String[] args) {
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

        // Call method to check perfect numbers
        findPerfectNumbers(upperLimit);
        scanner.close();
    }

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
}
