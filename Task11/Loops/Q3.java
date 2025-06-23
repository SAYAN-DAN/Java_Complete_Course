
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.print(result + " ");
        }
    }
}
