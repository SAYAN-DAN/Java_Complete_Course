
import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number which you want top get multiplication table : ");
        int takenum = number.nextInt();
        int val = takenum;
        for (int i = 1; i <= 10; i++) {
            val = takenum * i;
            System.out.println("The " + i + " th multipiication value of the number " + takenum + " is " + val);
        }
    }
}
