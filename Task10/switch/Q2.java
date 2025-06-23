
import java.util.Scanner;

public class Q2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the  number: ");
        int val1 = input.nextInt();


        String result = val1 % 2 == 0 ?  "Even" : "Odd";
        System.out.println("The number is : "+ result);



    }
}
