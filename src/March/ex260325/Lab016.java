package March.ex260325;

import java.util.Scanner;

public class Lab016 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = sc.nextInt();
        int i = 1;
        while (i <= age) {
            System.out.println(age);
            age--;
        }
    }
}
