package abstarction;

public class StudentImpl extends Student{
    @Override
    public void getData() {
        System.out.println("pk");
    }

    public static void main(String[] args) {
        StudentImpl st=new StudentImpl();
        int i=st.getName();
        st.getData();
        System.out.println(i);

    }
}
