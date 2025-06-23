import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Amount of  Number: ");
        int num = input.nextInt();
        int sum = 0;
        for (int i = 0; i < num; i++) {
            System.out.print("Enter the Number: ");
            int number = input.nextInt();

            if (number < 0) {
                continue;
            } else {
                sum += number;
            }
        }

        System.out.print("The total sum of all the number  except negative is: " + sum);
    }
}
