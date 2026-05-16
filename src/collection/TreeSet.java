package collection;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<String> s =new java.util.TreeSet<>();
        s.add("hello");
        s.add("by");
        s.add("good");
        s.add("by");
       
        System.out.println(s);
    }
}
