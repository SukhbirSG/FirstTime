package March.ex240325;

import java.util.Scanner;

public class Lab011 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser to be handled");
        String value=sc.next();
        switch (value){
            case "chrome" :
            System.out.println("Invoke Chrome browser");
            break ;
            case "edge" :
                System.out.println("Invoke Edge browser");
                break ;
            default:
                System.out.println("I dont know which browser this is");
        }
    }
}
