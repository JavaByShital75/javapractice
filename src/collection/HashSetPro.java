package collection;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetPro
{
    public static void main(String[] args) {
        // Creating

        HashSet<Integer> set=new HashSet<>();

        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Size

        System.out.println("size of set is:"+set.size());

        //Search contains

        if(set.contains(1)){
            System.out.println("set contailns 1");
        }
        if(!set.contains(6)){
            System.out.println("does not match");
        }
        // Delete

        set.remove(1);
        if(!set.contains(1)){
            System.out.println("does not contain 1");

            // Iterator

            Iterator it=set.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }


        }
    }

}
