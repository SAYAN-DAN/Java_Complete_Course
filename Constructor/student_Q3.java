// Parameterized Constructor
// Create a class Student with a constructor that accepts name and roll number, and displays them.

public class student_Q3 {
    String name;
    long roll;

    student_Q3(String name, long roll) {
        this.name = name;
        this.roll = roll;
    }

    void display() {
        System.out.println(name + " " + roll);
    }

    public static void main(String[] args) {
        student_Q3 student = new student_Q3("Sayan Dan", 230340940011L);
        student.display();
    }
}
