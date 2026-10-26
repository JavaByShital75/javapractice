package team;

public class Main extends A {
    void show(){
        System.out.println(super.a);
    }

    public static void main(String[] args) {
       Main m= new Main();
       m.show();
    }

}
