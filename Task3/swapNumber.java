
import java.util.Scanner;
public class swapNumber {
   public static void main(String[] argc){
      Scanner Number = new Scanner(System.in);

      System.out.println("Enter the First Number: ");
      int num1 = Number.nextInt();

      System.out.println("Enter the second Number: ");
      int num2 = Number.nextInt();
     
      int swap = num1;
      num1 = num2;
      num2 = swap;

      System.out.println("After swapng first number is: " + num1);
      System.out.println("After swapng second number is: " + num2);
   }
}