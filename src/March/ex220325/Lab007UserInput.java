package March.ex220325;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab007UserInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.next();
        System.out.println("Enter age");
        int age= sc.nextInt();
        System.out.println("Enter salary");
        int salary= sc.nextInt();
        System.out.println(name + age + salary);
        sc.close();

    }
}
