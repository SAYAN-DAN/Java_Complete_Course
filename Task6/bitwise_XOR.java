import java.util.Scanner;

public class bitwise_XOR {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = number.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = number.nextInt();

        int num3 = num1 ^ num2;
        System.out.println("The bitwise_XOR of the two number is: " + num3);
    }
}

// The bitwise XOR (exclusive OR) operation compares corresponding bits of two
// operands. If the bits are different, the result is 1; if they are the same,
// the result is 0.

// in bitwse OR only 0 ^ 0 and 1 ^ 1 become 0 other all become 1 (1 & 0,0 & 1)
// 12 = 1 1 0 0
// 15 = 1 1 1 1
// -------------------
// 15 = 0 0 1 1 (ANS)