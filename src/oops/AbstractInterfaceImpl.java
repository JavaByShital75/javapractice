package oops;

public class AbstractInterfaceImpl implements AbstractInterface{

    @Override
    public void getData() {
        System.out.println("data inserted");
    }

    public static void main(String[] args) {
        AbstractInterfaceImpl ab=new AbstractInterfaceImpl();
        ab.getData();

    }
}
