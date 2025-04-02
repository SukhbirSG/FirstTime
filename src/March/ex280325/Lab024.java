package March.ex280325;

import java.util.Scanner;

public class Lab024 {
    public static void main(String[] args) {
        /* Rough logic
        Input- scanner class , output - reverse string
        function */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be investigated");
        String str = sc.nextLine().toLowerCase();
        palindrome(str);

    }

    static void palindrome(String str) {
        String rev="";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }


        if (str.equals(rev)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

    }
}
