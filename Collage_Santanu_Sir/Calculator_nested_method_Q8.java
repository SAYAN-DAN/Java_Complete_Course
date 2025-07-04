
public class Calculator_nested_method_Q8 {
    int num1, num2;

    // Method to accept input
    void input(int a, int b) {
        num1 = a;
        num2 = b;
    }

    // Method to calculate sum
    int calculateSum() {
        return num1 + num2;
    }

    // Method demonstrating nesting of methods
    void displayResult() {
        input(10, 20); // calling input method
        int sum = calculateSum(); // calling calculateSum method
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        Calculator_nested_method_Q8 cal = new Calculator_nested_method_Q8();
        cal.displayResult(); // nesting happens inside this method
    }
}
