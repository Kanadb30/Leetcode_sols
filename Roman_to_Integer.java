package Leetcode_sols;

import java.util.Scanner;

public class Roman_to_Integer {
    public static int romanToInteger(char ch){
        int number = 0;
        switch (ch) {
            case 'I' -> number = 1;
            case 'V' -> number = 5;
            case 'X' -> number = 10;
            case 'L' -> number = 50;
            case 'C' -> number = 100;
            case 'D' -> number = 500;
            case 'M' -> number = 1000;
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE ROMAN NUMBER : ");
        String roman = sc.nextLine();
        roman = roman.toUpperCase();

        int length = roman.length();
        char ch = roman.charAt(length-1);
        int sum = romanToInteger(ch);

        while ( length > 1 ){
            int ch1 = romanToInteger(roman.charAt( length-1 ));
            int ch2 = romanToInteger(roman.charAt( length-2 ));

            if (ch1 > ch2){
                sum -= ch2;
            }
            else{
                sum += ch2;
            }
            length--;
        }
        System.out.println(sum);

    }
}
