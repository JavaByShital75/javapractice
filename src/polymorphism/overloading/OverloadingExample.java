package polymorphism.overloading;

import polymorphism.Overriding;

public class OverloadingExample {
    public int getname(){
        return 25;

    }
    public int getname(int a){
        return 10;


    }
    public int getname(int a,int b) {
        return 15;
    }


    public static void main(String[] args) {
        OverloadingExample o =new OverloadingExample();
        System.out.println(o.getname()+" "+o.getname(1)+" "+o.getname(1,8));


    }
}
