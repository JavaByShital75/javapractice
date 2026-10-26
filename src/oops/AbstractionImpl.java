package oops;

public class AbstractionImpl extends Abstraction {

    @Override
    public void getData() {
        System.out.println("data");
    }

    public static void main(String[] args) {
        AbstractionImpl a=new AbstractionImpl();
        a.getData();
        a.getName();


    }
}
