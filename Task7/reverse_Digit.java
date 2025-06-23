import java.util.Scanner;

public class reverse_Digit {
      public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = number.nextInt();
        int resultn=n;
        int reversedigit =0;
        int module;
        while(n !=0){ // 4578
            module = n % 10;
            reversedigit = reversedigit * 10 + module;
            n = n / 10; 
        }
        System.out.print( " The Reverse of the number "+resultn+" is: "+ reversedigit );
     }
}
