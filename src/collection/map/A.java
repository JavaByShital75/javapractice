package collection.map;

import java.util.*;

public class A {
    public static void main(String[] args) {
         Map<String,String> h=new HashMap<>();
         h.put("shital","200");
        h.put("shitu","700");
        h.put("shital","300");
        h.put("shi","20");
        System.out.println(h);
        System.out.println(h.get("shitu"));

//        for(Map.Entry<String, String> s : h.entrySet()) {
//           String s1 =s.getKey();
//           String s2=s.getValue();
//          System.out.println(s1+" "+s2);
//        }
        Set<Map.Entry<String, String>> entries = h.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();

        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+" "+next.getValue());


        }

        ArrayList<String> objects = new ArrayList<>();
        objects.add("ram");
        objects.add("syam");
        objects.add("raj");
        objects.add("tyson");

         int count = 0;
      while(count<objects.size()){
      System.out.println(objects.get(count));
      count ++;

      }

    }

}
