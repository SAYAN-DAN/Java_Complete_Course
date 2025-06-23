
import java.util.Scanner;

public class sum_all_odd_numbers {
  public static void main(String[] args) {
    Scanner number = new Scanner(System.in);
    System.out.print("Enter the number: ");
    int num = number.nextInt();
    int oddsum = 0;
    for (int i = 1; i <= num; i++) {
      if (i % 2 != 0) {
        oddsum += i;
      }
    }
    System.out.println("The sum of the all odd number till "+ num+ " is " + oddsum);
  }

}
