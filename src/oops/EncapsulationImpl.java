package oops;

public class EncapsulationImpl {
    public static void main(String[] args) {
        Encapsulation e=new Encapsulation();
       e.setName("shital");
       e.setAge(22);
//       String s=e.getName();
//       int i=e.getAge();
       System.out.println(e.getAge());
       System.out.println(e.getName());
    }

}
