import java.util.Scanner;

public class bitwise_NOT {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num1 = number.nextInt();

        // Flip only the lower 4 bits
        int result = (~num1) & 0xF; // 0xF = 0000 1111 (mask for 4 bits)

        System.out.println("Bitwise NOT of lower 4 bits: " + result);
    }
}
