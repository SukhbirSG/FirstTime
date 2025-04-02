package March.ex240325;

import java.util.Scanner;

public class Lab009 {
    // ✅ Grade Calculator:
// Write a program that calculates and displays the letter grade
// for a given numerical score (e.g., A, B, C, D, or F)
// based on the following grading scale:
//A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: 0-59
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score between 0 and 100");
        int score = sc.nextInt();
        char grad;
        if ((score >= 90) && (score <= 100)) {
            System.out.println("The Grade is A ");
        } else if ((score >= 80) && (score <= 89)) {
            System.out.println("The Grade is B ");
        } else if ((score >= 70) && (score <= 79)) {
            System.out.println("The Grade is C");
        } else if ((score >= 60) && (score <= 69)) {
            System.out.println("The Grade is D ");
        } else if ((score >= 0) && (score <= 59)) {
            System.out.println("The Grade is F ");
        }
        sc.close();
    }
}