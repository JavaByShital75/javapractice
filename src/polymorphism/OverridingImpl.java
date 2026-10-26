package polymorphism;

public class OverridingImpl extends Overriding {

    @Override
    public void getMesg(String name) {
        String rev="";
        for(int i=name.length()-1;i>=0;i--){
          rev  =rev+name.charAt(i);

        }
        System.out.println(rev);
    }

    public static void main(String[] args) {
       OverridingImpl overriding= new OverridingImpl();
       overriding.getMesg("hello shitu");
String str=" Shail ";
System.out.println(str.trim());
    }


}
