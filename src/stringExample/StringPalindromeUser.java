package stringExample;

import java.util.Scanner;

public class StringPalindromeUser {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        String str=s.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
         rev=rev+str.charAt(i);
        }
        if(str.equalsIgnoreCase(rev)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }
    }
}
