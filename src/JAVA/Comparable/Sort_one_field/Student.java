package JAVA.Comparable.Sort_one_field;

public class Student implements Comparable<Student> {
    private int rollNumber;
    private String name;
    private int marks;

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public Student(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.rollNumber, other.rollNumber);
    }

    @Override
    public String toString() {
        return "Student{" + "rollNumber=" + rollNumber + ", name='" + name + '\'' + ", marks=" + marks + '}';
    }
}
