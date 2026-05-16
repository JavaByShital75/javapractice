package abstarction;

public class EmployeeImpl implements Employee {



    @Override
    public void getData() {
        System.out.println("hi");

    }

    @Override
    public int getName(int i) {
        return i;
    }

    public static void main(String[] args) {
        EmployeeImpl employee=new EmployeeImpl();
        employee.getData();
        int i=employee.getName(12);
        System.out.println(i);
    }
}
