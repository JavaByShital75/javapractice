package shitupractice;

public class Fibonacci {
    public static void main(String[] args) {
        int n=10;
        int firstTerm=0;
        int secondTrem=1;

        for(int i=1; i<n; i++){
            System.out.println(firstTerm+ " ");
            int nextTerm =firstTerm+secondTrem;
            firstTerm=secondTrem;
            secondTrem=nextTerm;



        }
        int p=10;
       System.out.println(fibonacci(p));
    }
    public static int fibonacci(int n){
      if(n<=1){
          return n;
      }
      return fibonacci(n-1)+fibonacci(n-2);

    }
}
