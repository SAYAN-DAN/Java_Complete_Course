
import java.util.Scanner;

public class sum_and_average {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the total, element number :");
        int n = num.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the "+ i+ " element : ");
            arr[i] = num.nextInt();
        }
        // int[] arr = { 12, 23, 45, 21, 22 };
        // int n = arr.length;
        int sum = 0;
        double average = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        average += (double) sum / n;

        System.out.println("The sum of all the element in the array is : " + sum);
        System.out.println("The average of all the element in the array is : " + average);

        num.close();
    }

}
