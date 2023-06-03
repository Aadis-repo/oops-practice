import java.util.Objects;

public class Student implements Comparable<Student>{
    private String name;
    private int rollNo;

    public Student(String name,int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString(){
        return "Student = "+this.name + " : "+this.rollNo;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return this.rollNo == student.rollNo;
    }

    @Override
    public int hashCode(){
        return Objects.hash(rollNo);
    }

    @Override
    public int compareTo(Student other) {
        return this.rollNo - other.rollNo;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return rollNo == student.rollNo && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, rollNo);
//    }
}
