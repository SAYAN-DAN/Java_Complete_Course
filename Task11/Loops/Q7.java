import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your command: ");
            String command = input.next();
            if (command.equals("exit")) {
                break;
            }
        }

        System.out.println("Your code is successfully Exit");
    }
}
