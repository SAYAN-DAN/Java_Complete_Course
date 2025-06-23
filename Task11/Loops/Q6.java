import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        System.out.print("Welcome to finding the Array: ");
        Scanner input = new Scanner(System.in);

        System.out.print("\nEnter size of array: ");
        int size = input.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("The number is want to calculate occurence: ");
        int occur = input.nextInt();
        int count = 0;
        for (int value : arr) {
            if (value == occur) {
                count++;
            }
        }

        System.out.println("The number of occurence of " + occur + " is " + count);
    }
}
