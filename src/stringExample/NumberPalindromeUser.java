package stringExample;

import java.util.Scanner;

public class NumberPalindromeUser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int number= sc.nextInt();
        int original=number;
        int rev=0;
        while (number>0) {
            int rim = number % 10;
            rev = (rev * 10) + rim;
            number = number / 10;
        }
        if(original==rev){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }

    }
}
