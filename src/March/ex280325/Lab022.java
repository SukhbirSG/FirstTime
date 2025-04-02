package March.ex280325;

import java.util.Scanner;

public class Lab022 {
    public static void main(String[] args) {
        //reverse a number using loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the number to be reversed");
        int num = sc.nextInt();
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed number is " +rev);

    }
}
