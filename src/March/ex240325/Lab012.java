package March.ex240325;

import java.util.Scanner;

public class Lab012 {
    public static void main(String[] args) {
        /*Create a simple calculator that performs addition, subtraction,
        multiplication, and division, modus based on user input
        using switch statements.

                Inputs :   num 1, num 2, +
                Output :  num1+num2 → print information.*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number");
        int num2 = sc.nextInt();
        System.out.println("Enter the calculation to be made --- +,-,*,/");
        String val = sc.next();
        switch (val) {
            case "+":
                System.out.println("The result of addition is " + (num1 + num2));
                break;
            case "-":
                System.out.println("The result of subtraction is" + (num1 - num2));
                break;
            case "*":
                System.out.println("The result of multiplication is " + (num1 * num2));
                break;
            case "/":
                System.out.println("The result of division is " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid input -please add one of + ,-,*,?");
                break;


        }
    }
}
