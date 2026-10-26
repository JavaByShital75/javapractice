package stringExample;

public class ReverseEachWord {
    public static void main(String[] args) {
        String name= "tyson my boy";
        String[] str =name.split(" ");
        StringBuilder sb =new StringBuilder();
        for(String s:str){
            for(int i=s.length()-1;i>=0;i--) {
                sb.append(s.charAt(i));
            }
            sb.append(" ");
        }
       String n=sb.toString();
        System.out.println(n);

        }
}

