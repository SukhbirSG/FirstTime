package March.ex270325;

import java.util.Scanner;

public class Lab018 {
    //extract vowels and consonants in a string
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.next();
        int vcount = 0;
        int ccount = 0;
        for (int i = 0; i <= str.length(); i++) {
            char chr = str.charAt(i);
            if ((chr == 'A') || (chr == 'a') || (chr == 'E') ||(chr == 'e') || (chr == 'I') ||(chr == 'i') || (chr == 'O') ||(chr == 'o') || (chr == 'U') || (chr == 'u')) {
                vcount = vcount + 1;
                System.out.println("Vowels : " + chr);
            } else {
                ccount = ccount + 1;
                System.out.println("Consonants : " + chr);
            }
            System.out.println("Number of vowels : " + vcount);
            System.out.println("Number of constants : " + ccount);

        }
    }
}
