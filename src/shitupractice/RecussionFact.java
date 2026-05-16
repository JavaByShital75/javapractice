package shitupractice;

public class RecussionFact {
    public static int fact(int n){
      if(n==0 || n==1)  {
          return 1;
      }
      else {
          return n*fact(n-1);

        }

}
public static void main(String[] args) {
      int f= fact(5);
      System.out.println(f);
    }
}
