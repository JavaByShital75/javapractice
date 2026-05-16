package oops;

public class PolymorphismOverridingImpl extends PolymorphismOverriding{
    public void animal(){
        System.out.println("my dog name is tyson");
    }

    public static void main(String[] args) {
        PolymorphismOverriding p=new PolymorphismOverridingImpl();
        p.animal();
    }
}
