
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter the  number: ");
        int val1 = input.nextInt();
        
        int result = val1 >=0 ? val1 : -val1;
        System.out.print("The Absolute value of the number is: " + result);
    }
}
