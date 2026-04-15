
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ComparableDemo {
    static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("charlie", 3.5));
        list.add(new Student("bob", 3.7));
        list.add(new Student("alice", 3.5));
        list.add(new Student("akshit", 3.9));
        List<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(1);
        number.add(99);
        number.sort(null);
        System.out.println(number);
        list.sort(null);
        System.out.println(list);

    }
}
class Student implements Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name , double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getGpa(), this.getGpa());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
