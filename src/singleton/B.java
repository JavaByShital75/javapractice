package singleton;

public class B {
    public static void main(String[] args) {
        A a=new A();
        A a1=new A();

        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());
        SingleToneDesignPattern s1  =SingleToneDesignPattern.getInstance();
        SingleToneDesignPattern s2  =SingleToneDesignPattern.getInstance();
        s1.getData();
        s2.getData();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }

}
