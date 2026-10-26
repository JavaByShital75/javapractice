package polymorphism.overloading;

public class ClassOverloading {
    public ClassOverloading(){
System.out.println("default constructor");
    }
    public ClassOverloading(int a){
        System.out.println("single constructor "+a);
    }
    public ClassOverloading(int a, String name){
        System.out.println("multiple constructor "+a+ " "+name);
    }

    public static void main(String[] args) {
        ClassOverloading c=new ClassOverloading();
        ClassOverloading k=new ClassOverloading(5);
        ClassOverloading d=new ClassOverloading(5,"shital");
    }
}
