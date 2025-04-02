package March.ex280325;

import java.util.Scanner;

public class Lab023 {
    public static void main(String[] args) {
        //count vowels and consonants in a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to be investigated");
        String str = sc.next();
        int i = 0, vcount=0, ccount=0;
        for (i = 0; i <= str.length(); i++) {
            char fir = str.charAt(i);
            if (fir == 'A' || fir == 'a' || fir == 'E' || fir == 'e' || fir == 'O' || fir == 'o' || fir == 'U' || fir == 'u') {
                vcount = vcount + 1;

            } else {
                ccount = ccount + 1;

            }
            System.out.println("Number of vowels in the string are" + vcount);
            System.out.println("Number of consonants in the string are" + ccount);
            sc.close();

        }

    }
}
