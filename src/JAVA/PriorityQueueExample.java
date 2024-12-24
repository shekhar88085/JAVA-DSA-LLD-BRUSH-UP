package JAVA;
import java.time.LocalDate;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {
    String name;
    int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(o.grade, this.grade); // this will print in desc, do compare(this.grade, o.grade) for asc
    }

    @Override
    public String toString() {
        return name + " (Grade: " + grade + ")";
    }
}

class Task implements Comparable<Task> {
    String name;
    int priority;
    LocalDate deadline;

    Task(String name, int priority, LocalDate deadLine) {
        this.name = name;
        this.priority = priority;
        this.deadline = deadLine;
    }

    @Override
    public int compareTo(Task t) {
        if (this.priority != t.priority) {
            return Integer.compare(t.priority, this.priority);// for descending order
        }
        return this.deadline.compareTo(t.deadline);
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ", Deadline: " + deadline + ")";
    }
}

public class PriorityQueueExample {
    public void run() {
        PriorityQueue<Student> pqStudents = new PriorityQueue<>();
        pqStudents.add(new Student("Mia Khalifa", 10));
        pqStudents.add(new Student("Danny Daniels", 66));
        pqStudents.add(new Student("Sunny Leone", 33));
        pqStudents.add(new Student("Alex", 0));
        pqStudents.add(new Student("xxxxxxx", 76));

        // Step 4: Print the students in order of priority
        System.out.println("Students in order of priority:");
        while (!pqStudents.isEmpty()) {
            System.out.println(pqStudents.poll().toString());
        }

        // Task Sceduler
        PriorityQueue<Task> taskQueue = new PriorityQueue<>();
        // Add tasks to the queue
        taskQueue.add(new Task("Complete report", 5, LocalDate.of(2024, 9, 1)));
        taskQueue.add(new Task("Email client", 3, LocalDate.of(2024, 8, 30)));
        taskQueue.add(new Task("Fix bug", 4, LocalDate.of(2024, 8, 28)));
        taskQueue.add(new Task("Team meeting", 1, LocalDate.of(2024, 8, 31)));
        taskQueue.add(new Task("Prepare presentation", 1, LocalDate.of(2024, 8, 29)));

        // Step 4: Print the students in order of priority
        System.out.println("Students in order of priority:");
        while (!taskQueue.isEmpty()) {
            System.out.println(taskQueue.poll().toString());
        }
    }
}
