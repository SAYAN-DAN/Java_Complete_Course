import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to printing Fibonacci Series: ");
        System.out.print("Enter the number of element to be printed: ");
        int count = input.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }

    public static int Fibonacci(int count) {
        if (count == 0) {
            return 0;
        }
        if (count == 1) {
            return 1;
        }
        return Fibonacci(count - 1) + Fibonacci(count - 2);
    }

}
