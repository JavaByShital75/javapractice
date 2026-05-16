package comparator;

import java.util.Comparator;

public class CompareByID implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.empId-o2.empId;
    }
}
