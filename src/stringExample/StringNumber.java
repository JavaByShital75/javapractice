package stringExample;

public class StringNumber {
    public static void main(String[] args) {
        int number=454;

        int rev=0;
       int originsl = number;
        while(number>0) {
            int rim = number % 10;
            rev = (rev * 10) + rim;
            number = number / 10;
        }
        System.out.println(rev);
        if(originsl==rev){
            System.out.println("this is palindrome");
        }
else{
            System.out.println("this is not a palindrome");
        }
    }
}
