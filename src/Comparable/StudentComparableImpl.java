package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class StudentComparableImpl {
    public static void main(String[] args) {
         ArrayList<StudentComparable> list=new ArrayList<>();
         list.add(new StudentComparable(2,"tyson"));
        list.add(new StudentComparable(1,"ji"));
        list.add(new StudentComparable(5,"ty"));
        list.add(new StudentComparable(4,"lion"));
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
