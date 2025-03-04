//This is a program that finds perfect numbers within a users given range


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

            // If sum of divisors = number, it's perfect
            if (sum == num) {
                System.out.println(num + " is perfect!");
            }
        }
    }
}
