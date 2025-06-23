import java.util.Scanner;

public class rightShift {
     public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter the  number: ");
        int num1 = number.nextInt();

        System.out.print("Enter the  number of shift: ");
        int shift = number.nextInt();

        int num3 = num1 >> shift;
        System.out.println("The rightShift of the number is: " + num3);
    }
}
