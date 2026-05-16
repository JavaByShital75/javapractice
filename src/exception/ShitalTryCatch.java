package exception;

public class ShitalTryCatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {

        System.out.println("Arthmatic handling exception");
        }
try {
    String s = null;
    System.out.println(s.length());
} catch (Exception e) {
    System.out.println("nullpointer exception handling");
}
finally {

}
        System.out.println("hello shital");
    }
}
