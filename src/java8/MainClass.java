package java8;

public class MainClass {
    public static void main(String[] args) {
        FunctionalInterface intf = (x)-> x*x;
        System.out.println(intf.getData(4));
        intf.getPrint(10);

    }

}
