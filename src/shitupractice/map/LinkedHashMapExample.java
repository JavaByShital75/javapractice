package shitupractice.map;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
       Map<String, Integer>map = new HashMap<>();
       map.put("tyson",11);
       map.put("sinu",85);
       map.put("more",55);
       map.put("sunita",55);

       System.out.println(map);
    }
}
