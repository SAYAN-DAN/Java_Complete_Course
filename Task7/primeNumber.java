
import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = number.nextInt();

        if (num1 % 2 != 0) {
            System.out.println("This number is prime");
        } else {
            System.out.println("This number is not a prime");
        }
    }
}