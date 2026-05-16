package collection;

public class LinkedHashSet {
    public static void main(String[] args) {
         java.util.LinkedHashSet<String> s =new java.util.LinkedHashSet<>();
         s.add("tyson");
        s.add("sinu");
        s.add("bubu");
        s.add("bubu");
        s.add(null);
        System.out.println(s);

    }
}
