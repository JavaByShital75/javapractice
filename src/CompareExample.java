import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareExample {

public static class Student implements Comparable<Student> {
    int rollno;
    String name;
    int marks;

    Student(int rollno, String name, int marks){
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.rollno-o.rollno;
    }
}

static class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}

    static class MarksComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return o2.marks-o1.marks;
        }
    }

    public static void main(String[] args) {
        List<Student> sList = new ArrayList<>();
        sList.add(new Student(10,"ram", 90));
        sList.add(new Student(4,"chpttu", 80));
        sList.add(new Student(1,"hello", 100));
        sList.add(new Student(8,"syam", 50));
        //Collections.sort(sList);  //comparable for accending order by rollno

        // comparator by name in accending
        //Collections.sort(sList, new NameComparator());

        // comparator by marks in descending
        Collections.sort(sList, new MarksComparator());
        for(Student s:sList) {
            System.out.println(s);
        }

    }

}
