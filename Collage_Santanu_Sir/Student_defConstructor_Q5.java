public class Student_defConstructor_Q5 {
    String name;
    int age;

    // Default Constructor
    Student_defConstructor_Q5() {
        name = "John Doe";
        age = 18;
    }

    // Method to display values
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        Student_defConstructor_Q5 s1 = new Student_defConstructor_Q5(); // default constructor is called
        s1.display();
    }
}
