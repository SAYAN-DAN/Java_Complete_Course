public class static_memberQ7 {
    int rollNumber;
    String name;
    static String college = "ABC College"; // static variable

    // Constructor
    static_memberQ7(int roll, String name) {
        this.rollNumber = roll;
        this.name = name;
    }

    // Method to display static_memberQ7 details
    void display() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", College: " + college);
    }

    public static void main(String[] args) {
        static_memberQ7 s1 = new static_memberQ7(101, "Sayan");
        static_memberQ7 s2 = new static_memberQ7(102, "Rahul");

        s1.display();
        s2.display();
    }

}
