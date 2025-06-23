
import java.util.Scanner;

public class bitwise_AND {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = number.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = number.nextInt();

        int num3 = num1 & num2;
        System.out.println("The bitwise_AND of the two number is: " + num3);
    }
}

// in bitwse abd only 1 & 1 become 1 other all become 0 (1 & 0,0 & 1,0 & 0)
// 12 = 1 1 0 0 
// 15 = 1 1 1 1 
// -------------------
// 12 = 1 1 0 0 (ANS)