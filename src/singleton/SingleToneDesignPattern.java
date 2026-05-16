package singleton;

public class SingleToneDesignPattern {
    private static SingleToneDesignPattern instance;

    private SingleToneDesignPattern() {

    }

    public static SingleToneDesignPattern getInstance() {
        if (instance == null) {
            instance = new SingleToneDesignPattern();
        }

        return instance;


    }
    public void getData(){
        System.out.println("hi");
    }
}

