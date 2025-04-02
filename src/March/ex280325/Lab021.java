package March.ex280325;

import java.util.Scanner;

public class Lab021 {
    public static void main(String[] args) {
        // write a function to write sum,sub,multiplication,division using user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int resultofsum = sum(a, b);
        System.out.println("Result of sum is" + resultofsum);

        int resultofsub = sub(a, b);
        System.out.println("Result of subtraction is" + resultofsub);

        int resultofmul = mul(a, b);
        System.out.println("Result of multiplication is " + resultofmul);

        int resultofdiv = div(a, b);
        System.out.println("Result of division is " + resultofdiv);


    }

    static int sum(int a, int b) {
        return a + b;

    }

    static int sub(int a, int b) {
        return a - b;

    }

    static int mul(int a, int b) {
        return a * b;

    }

    static int div(int a, int b) {
        return a / b;

    }


}

