package stringExample;

import java.sql.SQLOutput;

public class StringReverse {
    public boolean isPalidrom(String name){


        String rev="";
        for(int i=name.length()-1;i>=0;i--){
          rev= rev+name.charAt(i);
        }
        System.out.println(rev);
        if(name.equalsIgnoreCase(rev)){
           return true;
        }
       else{
            return false;
        }

    }
    public boolean isPalidromNumber(int number) {
        int rev=0;
        int originsl = number;
        while(number>0) {
            int rim = number % 10;
            rev = (rev * 10) + rim;
            number = number / 10;
        }
        System.out.println(rev);
        if(originsl==rev){
            return true;
        }
        else{
            return  false;
        }
    }

        public static void main(String args[]){
        StringReverse s=new StringReverse();
        boolean b=s.isPalidrom("ram");
        boolean c=s.isPalidromNumber(122);
        if(b){
            System.out.println("this is palindrome");
        } else {
            System.out.println("this is not palindrome");
        }

            if(c){
                System.out.println("this is palindrome");
            } else {
                System.out.println("this is not palindrome");
            }
}
}