package encapsulation;

public class StudentImpl {
    public static void main(String[] args) {
      Student s=new Student();
      s.setName("tyson");
      s.setGetRollnum(12);
      String t=s.getName();
      int i=s.getGetRollnum();
      System.out.println(i+ "  "+ t);
    }
}
