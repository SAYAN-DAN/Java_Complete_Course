
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcme to our password checker Game:\n ");
        String password;

        do {
            System.out.print("please Enter the password: ");
            password = input.next();
        } while (!isValidPassword(password));
        System.out.println("You successfully enter the currect password");
    }

    public static boolean isValidPassword(String password) {
        return password.length() > 6;
    }
}
