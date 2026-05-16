package singleton;

public class SingleToneProImpl {

    public static void main(String[] args) {

        SingleTonePro singleTonePro1=SingleTonePro.getData();

        System.out.println(singleTonePro1.hashCode());

        SingleTonePro singleTonePro2=SingleTonePro.getData();

        System.out.println(singleTonePro2.hashCode());

        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());

    }
}
