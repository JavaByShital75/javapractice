package exception;

public class TryAndCatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e){
            System.out.println("Arithmatic excetion handling");
        }
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
          System.out.println("nullpointer excetion handling");

        }
       finally {

        }
System.out.println("program run succesfully");



    }
}
