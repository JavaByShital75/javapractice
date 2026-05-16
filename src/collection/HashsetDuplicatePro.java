package collection;

import java.util.HashSet;

public class HashsetDuplicatePro {
    public static void main(String[] args) {
        int[] num ={1,3,5,7,3,9,1};
         HashSet original=new HashSet<>();
        HashSet dup=new HashSet<>();

         for(int i:num){
             if(!original.add(i)){
                 dup.add(i);
             }
         }
        System.out.println(original);
        System.out.println(dup);
    }
}
