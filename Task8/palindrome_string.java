
import java.util.Scanner;

public class palindrome_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        if (str.equals(reversed)) {
            System.out.print(str + " is a reversed palindrome");
        } else {
            System.out.print(str + " is not a reversed palindrome");
        }
    }
}
