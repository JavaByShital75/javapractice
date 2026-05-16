package stringExample;

import java.util.HashMap;
import java.util.Map;

public class StringOccuranceCount {

    public static void main(String[] args) {

        String str= "caabbccacccccb";
        char[] charArray = str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:charArray){
        if(map.containsKey(c)){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        else{
         map.put(c,1);

        }

        }
System.out.println(map);

        String name ="Tyson.prakshi";
        String rev= "";

       for(int i=name.length()-1;i>=0;i--){
          rev=rev+name.charAt(i);

        }

        System.out.println(rev);

    }

}


