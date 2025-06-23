import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int val1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int val2 = input.nextInt();

        int result = val1 < val2 ? val1 : val2;
        System.out.println("The minimum number is : " + result);

    }
}
