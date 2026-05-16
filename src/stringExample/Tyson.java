package stringExample;

public class Tyson {
    public static void main(String[] args) {
        String s1="hello";
        String s2="hello";
        String s3=new String ("hello");
        String s4=new String ("hello");
        String s5=s1;
        String s6=s3;
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s3);
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s6.equals(s4));
    }



}
