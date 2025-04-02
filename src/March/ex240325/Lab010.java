package March.ex240325;

import java.util.Scanner;

public class Lab010 {
    public static void main(String[] args) {
      /*  Given three input values representing the lengths of the sides,
        determine if the triangle is equilateral (all sides are equal),
        isosceles (exactly two sides are equal), or scalene (no sides are equal).
                Use an if-else statement to classify the triangle.*/
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first side of the traingle");
        int side1=sc.nextInt();
        System.out.println("Enter the second side of the traingle");
        int side2=sc.nextInt();
        System.out.println("Enter the third side of the triangle");
        int side3=sc.nextInt();
        if (side1==side2 && side2==side3 && side1==side3){
            System.out.println("It is a equilateral triangle");
        }
        else if(side1 == side2 || side2 == side3 || side1 == side3){
            System.out.println("It is an isosceles triangle");
        }
        else if (side1 <=0 || side2 <=0 ||side3<=0) {
            System.out.println("Invalid output-Sides are always positive");
        }else{
                System.out.println("It is a scalene triangle");
            }
            sc.close();
        }
    }

