package March.ex010425;

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the numbers");
            numbers[i] = sc.nextInt();

        }
        System.out.println("The numbers are");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        int max = 0;
        numbers[0] = max;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > numbers[0]) {
                max = numbers[i];

            }


        }
        System.out.println("The max number is" + max);


    }
}
