package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class EmplyeeImpl {
    public static void main(String[] args) {
         ArrayList<Employee>  emp=new ArrayList<>();
         emp.add(new Employee(2, "hi"));
        emp.add(new Employee(4, "lo"));
        emp.add(new Employee(3, "ko"));
        emp.add(new Employee(1, "i"));
        System.out.println(emp);
        Collections.sort(emp,new CompareByID());
        System.out.println(emp);
        Collections.sort(emp,new CompareByName());
        System.out.println(emp);
    }
}
