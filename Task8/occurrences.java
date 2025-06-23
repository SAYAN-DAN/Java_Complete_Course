import java.util.Scanner;

public class occurrences {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the total, element number :");
        int n = num.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + i + " element : ");
            arr[i] = num.nextInt();
        }



        int count =0;
        System.out.println("Enter the number you want to know occurence::");
        int num1 = num.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i] == num1){
                count++;
            }
        }
    }
}
