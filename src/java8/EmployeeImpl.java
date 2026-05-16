package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EmployeeImpl {
    public static void main(String[] args) {
       List<Employee> employeeList = new ArrayList<>();//[employee, employee, employee]

       Employee e1 = new Employee(1, "shital", 50000.89);
        Employee e2 = new Employee(2, "tyson", 40000);
        Employee e3 = new Employee(3, "shilesh", 30000);
        Employee e0 = new Employee(3, "shilesh", 30000);
        Employee e4 = new Employee(4, "ram", 20000);
        Employee e5 = new Employee(5, "syam", 89000);
        Employee e6 = new Employee(6, "more", 5000.89);
        Employee e7 = new Employee(7, "jeevan", 6000.89);
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);
        employeeList.add(e0);
        System.out.println(employeeList);
        ArrayList<Employee> a=new ArrayList<>();


        for(Employee e:employeeList){
            if(e.getSalary()>40000){
           a.add(e);

                System.out.println(e);
            }
        }
        System.out.println(a);
        // i need an employees data whose salary greater than 40k by using java8

       List<Employee> l = employeeList.stream().filter(e->e.getSalary()>40000).collect(Collectors.toList());
       System.out.println(l);

       List<Employee>list= employeeList.stream().filter(e->e.getSalary()>40000).collect(Collectors.toList());

        //<Employee>list1= (List<Employee>) employeeList.stream().distinct().collect(Collectors.toList());
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        Map<Integer, List<String>> groupedByLength = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);

        String str = "praprapra";
       Map<Character, Long> occ = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(occ);
    }
}
