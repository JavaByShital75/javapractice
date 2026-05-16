package oops;

public class PolymorphismOverloading {
    public int add(int a,int b){
     return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;

    }

    public static void main(String[] args) {
       PolymorphismOverloading p=new PolymorphismOverloading();
       int i=p.add(10,20);
       int t=p.add(25,58,50);
       System.out.println("i is "+i+" t is "+t);
    }
}
