package java8;

@java.lang.FunctionalInterface
public interface FunctionalInterface {
    public int getData(int i);

    default void getPrint(int i){
        System.out.println(i);
    }

    public static void getRam(String name){

        String rev = "";
        for(int i=name.length()-1; i>=0; i--){
            rev = rev+name.charAt(i);
        }
        System.out.println(rev);
    }

}
