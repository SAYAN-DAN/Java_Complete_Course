
import java.util.Scanner;

public class reverse_array {
   public static void main(String[] args) {
      int[] array = { 45, 65, 25, 85, 47, 36 };
      int n = array.length;
      System.out.print("The Original Array is: ");
      for (int i = 0; i < n; i++) {
         System.out.print(array[i] + " ");
      }

      for (int i = 0; i < n / 2; i++) {
         int temp = array[i];
         array[i] = array[n - 1 - i];
         array[n - 1 - i] = temp;
      }

      System.out.print("\nThe Reverse Array is : ");
      for (int i = 0; i < n; i++) {
         System.out.print(array[i] + " ");
      }
   }

}
