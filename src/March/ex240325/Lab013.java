package March.ex240325;

import java.util.Scanner;

public class Lab013 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number between 1 and 12 to print corresponding month");
        int val=sc.nextInt();
        switch(val) {
            case 1:
                System.out.println("1 corresponds to january in the english calendar");
                break;
            case 2:
                System.out.println("2 responds to february in the english calendar");
                break;
            case 3:
                System.out.println("3 corresponds to March in the english calendar");
                break;
            case 4:
                System.out.println("4 responds to April in the english calendar");
                break;
            case 5:
                System.out.println("5 corresponds to May in the english calendar");
                break;
            case 6:
                System.out.println("6 responds to June in the english calendar");
                break;
            case 7:
                System.out.println("7 corresponds to July in the english calendar");
                break;
            case 8:
                System.out.println("8 responds to August in the english calendar");
                break;
            case 9:
                System.out.println("9 corresponds to September in the english calendar");
                break;
            case 10:
                System.out.println("10 responds to October in the english calendar");
                break;
            case 11:
                System.out.println("11 corresponds to November in the english calendar");
                break;
            case 12:
                System.out.println("12 responds to December in the english calendar");
                break;
            default:
                System.out.println("Invalid input-Please enter numbers between to 1 and 12 to get the corresponding months in the english calendar");
                break;
        }

        }
    }
