package March.ex260325;

import java.util.Scanner;

public class Lab017 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number to reverse: ");

        // Read the integer input
        int n = scanner.nextInt();

        // Variable to store the reversed number
        int reversedNum = 0;

        // Original number to keep track of remaining digits
        int originalNum = n;

        // Reverse the number
        while(n > 0) {
            int digit = n % 10;  // Extract the last digit
            reversedNum = reversedNum * 10 + digit;  // Build reversed number
            n = n / 10;  // Remove the last digit from original number
        }

        // Print the results
        System.out.println("Original Number: " + originalNum);
        System.out.println("Reversed Number: " + reversedNum);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}




