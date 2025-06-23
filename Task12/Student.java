public class Student {
    String name;
    int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // toString method to print student details
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + "}";
    }

    // Main method to test
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 21);
        System.out.println(student1); // Automatically calls toString()
    }
}
