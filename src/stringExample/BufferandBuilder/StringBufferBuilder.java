package stringExample.BufferandBuilder;

public class StringBufferBuilder {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        sb.append(" Tyson");
        sb.append(" my love");
        String s=sb.toString();
        System.out.println(s);
        //System.out.println(sb);
        StringBuilder sx=new StringBuilder("hey");
        sx.append(" bubu");
        sx.append(" my jan");
        String f=sx.toString();
        System.out.println(f);
        //System.out.println(sb);
    }

}
