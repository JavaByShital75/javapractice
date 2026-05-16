package collection;

import java.util.HashMap;

public class HashMapPro {
    public static void main(String[] args) {
          HashMap<String,Integer>hm = new HashMap<>();
          hm.put("dolly",12);
          hm.put("meera",524);
          hm.put("null",245);
          hm.put("meera",5);
          hm.put("rina",5);
          System.out.println(hm);
        System.out.println(hm.get("dolly"));
        System.out.println(hm.containsKey("meera"));


    }

}
