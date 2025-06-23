
import java.util.Scanner;

public class calculate_factorila {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = number.nextInt();

        int fact1 = fact(n);
        System.out.println("The factorial of the number " + n + " is " + fact1);
    }

    public static int fact(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }else{
            return a *fact(a-1);
        }
    }
}
