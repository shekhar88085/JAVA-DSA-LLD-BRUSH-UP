package OOPS.OOPSLEARNING;

// Base class Person
public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        setAge(age);
    }

    // Getters and setters for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("InValid age");
        } else {
            this.age = age;
        }
    }

    public void introduce() {
        System.out.println("Hi, my name is " + getName() + " and I am " + getAge() + " years old.");
    }

    public void introduce(boolean isFormal) {
        if (isFormal)
            System.out.println("Hello, my name is " + getName() + ".");
        else
            System.out.println("Hi, I'm " + getName() + "!");
    }

    public void introduce(String message) {
        System.out.println("Hi, " + message + ", I’m " + getName() + "!");
    }
}

// Derived class Student that extends Person
class Student extends Person {
    private String studentId;

    public Student() {
    }

    public Student(String name, int age, String studentId) {
        super(name, age); // Calling the parent class constructor
        this.studentId = studentId;
    }

    // Getter and setter for studentId
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, my name is " + getName() + ", I am " + getAge() + " years old, and my student ID is "
                + getStudentId() + ".");
    }

    public void displayStudentInfo() {
        System.out.println("Hi, my name is " + getName() + ", I am " + getAge() + " years old, and my student ID is "
                + getStudentId() + ".");
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // Creating an instance of Person
        Person ella = new Person("Ella", 0);
        ella.introduce();
        ella.introduce(true);
        ella.introduce("nice to meet you");

        // Creating an instance of Student
        Student student = new Student("Elly", 11, "112w");
        student.displayStudentInfo();

        Person person = new Student("Chandra Shekhar", 27, "knx0141");
        person.introduce();
    }
}
