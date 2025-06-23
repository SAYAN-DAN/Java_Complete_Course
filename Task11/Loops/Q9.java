import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();

        // USING CONTINUE FOR ODD NUMBERS
        // for (int i = 1; i <= num; i++) {
        // if (i % 2 != 0) {
        // continue;
        // } else {
        // System.out.print(i + " ");
        // }
        // }

        // USING CONTINUE FOR ODD NUMBERS
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
