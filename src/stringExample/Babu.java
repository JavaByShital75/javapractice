package stringExample;

import team.A;

import java.util.Scanner;

public class Babu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your name");
       String name = sc.next();
       System.out.println("your name is "+name);
        System.out.println("please enter first no");
        int a = sc.nextInt();
        System.out.println("please enter second no");
        int b = sc.nextInt();

        System.out.println("addition of two number is "+(a+b));
        
        A aa=new A();
        int a1 = aa.a;
        System.out.println(a1);
    }
}
