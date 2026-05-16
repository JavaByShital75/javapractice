package shitupractice;

public class PrimeNo {
    public static boolean prime(int n) {
        if (n <= 0) {
            return false;
        }

            if (n % 2 == 0) {
                return false;
            } else {
                return true;
            }



    }

    public static void main(String[] args) {
        if(prime(2)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    }



