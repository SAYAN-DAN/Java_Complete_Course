
import java.util.Scanner;

public class palindrome_number {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a  Number:");
        int num = number.nextInt();
        int originalNum = num;

        int reverse = 0;
        int degit = 0;
        while (num != 0) {
            degit = num % 10;
            reverse = reverse * 10 + degit;
            num = num / 10;
        }

        if (originalNum == reverse) {
            System.out.print(originalNum + " is a palindrome number");
        } else {
            System.out.print(originalNum + " is not a palindrome number");
        }
    }
}
