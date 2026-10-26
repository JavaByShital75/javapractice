package singleton;

public class SingleToneImpl {
    public static void main(String[] args) {
        SingleTone s=SingleTone.getInstance();
        SingleTone s1=SingleTone.getInstance();
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());
    }
}
