package collection;

import java.util.LinkedList;

public class LinkedListImplPro {
    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("A");
        s.add("B");
        System.out.println(s);
        s.addLast("C");
        System.out.println(s);
        s.addFirst("D");
        System.out.println(s);
        s.add(2, "E");
        System.out.println(s);
        System.out.println("removing the element");
        s.remove("B");
        System.out.println(s);
        s.remove(3);
        System.out.println(s);
        s.removeFirst();
        System.out.println(s);
        s.removeLast();
        System.out.println(s);

        String name = "hi shital how are you";
        String rev = "";

        for (int i=name.length()-1;i>=0;i--) {
            rev=rev+name.charAt(i);

        }

        System.out.println(rev);
        String s1=nameReverse(name);
        System.out.println(s1);
    }
    public static String nameReverse(String name){
        String[] arr= name.split(" ");
        StringBuilder sb=new StringBuilder();
        for(String a:arr){
            for(int i =a.length()-1;i>=0;i--){
                sb.append(a.charAt(i));
            }
            sb.append(" ");
        }
        return sb.toString();

    }

    }

