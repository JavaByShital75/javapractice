package inherit;

public class Dog extends Animal{

    @Override
    public void getMsg() {
       System.out.println("hello");
    }


    public static void main(String[] args) {
        Dog d=new Dog();
        d.getMsg();
        int i=d.id();
        System.out.println(i);



    }
}
