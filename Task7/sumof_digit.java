
import java.util.Scanner;
public class sumof_digit {
     public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = number.nextInt();
        int resultn=n;
        int sumdigit =0;
        int module;
        while(n !=0){
            module = n % 10;
            sumdigit += module;
            n = n / 10; 
        }
        System.out.print( " The Sum of the digit of the number "+resultn+" is: "+ sumdigit );
     }
}
