package factorialfinder;

import java.util.Scanner;

/**
 * This program calculates the factorial of a given number.
 * It includes error handling to ensure only non-negative integers are accepted.
 */
public class FactorialFinder {
    
    /**
     * Main method to run the program.
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        
        if (!input.hasNextInt()) {
            System.out.println("Invalid input. Please enter a non-negative integer.");
        } else {
            int number = input.nextInt();
            if (number < 0) {
                System.out.println("Error: Factorial is not defined for negative numbers.");
            } else {
                System.out.println("Factorial of " + number + " is " + factorial(number));
            }
        }
        
        input.close();
    }
    
    /**
     * Calculates the factorial of a given number.
     * @param n The number to calculate the factorial for.
     * @return The factorial of n.
     */
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
