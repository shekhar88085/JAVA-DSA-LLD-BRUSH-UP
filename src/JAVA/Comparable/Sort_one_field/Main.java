package JAVA.Comparable.Sort_one_field;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", 85));
        students.add(new Student(1, "Bob", 92));
        students.add(new Student(2, "Charlie", 78));

        System.out.println("Before Sorting: " + students);

        Collections.sort(students);

        System.out.println("After Sorting based on roll number: " + students);

        Collections.sort(students, (s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks()));

        System.out.println("After Sorting based on marks: " + students);
    }
}