
import java.util.Scanner;

public class AddNumber {
    public static void main(String[] argc) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = number.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = number.nextInt();

        int num3 = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is : " + num3);
    }
}
