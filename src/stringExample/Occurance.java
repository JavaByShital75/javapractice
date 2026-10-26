package stringExample;

import java.util.HashMap;

public class Occurance {
    public static void main(String[] args) {
        String s= "abAn";
         String ab =s.toLowerCase();//a:2  a 2
         char ch = 'a';
         int count =0;
         char[] array =ab.toCharArray();

         for (char c :array){
             if(ch==c){
                 count++;
             }
         }

         System.out.println(ch+":"+count);


    }
}
