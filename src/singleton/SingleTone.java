package singleton;

public class SingleTone {
    public static SingleTone instance;

    private SingleTone() {
        System.out.println("singletone created");
    }

    public static SingleTone getInstance(){

        if (instance == null) {
            instance = new SingleTone();
        }
        return instance;

    }
}



