package March.ex020425;

import java.util.Scanner;

public class Lab027 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n=5");
        int size=sc.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j=size;j>i;j--){
                System.out.print("*");

            }
            System.out.println("");

        }
    }
}
