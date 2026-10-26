package Comparable;

public class StudentComparable implements Comparable<StudentComparable>{
    public int studId;
    public String name;

    public int getStudId() {
        return studId;
    }

    public void setStudId(int studId) {
        this.studId = studId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StudentComparable(int studId, String name) {
        this.studId = studId;
        this.name = name;
    }

    @Override
    public String toString() {
        return "StudentComparable{" +
                "studId=" + studId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(StudentComparable o) {
        return this.studId-o.studId;
    }
}
