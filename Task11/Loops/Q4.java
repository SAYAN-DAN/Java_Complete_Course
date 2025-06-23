import java.util.Scanner;

public class Q4 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        boolean isprime = true;
        for (int i = 2; i <num; i++) {
            if(num % i ==0){
               isprime = false;
            }
        }

        if(isprime == true){
            System.out.print("The Number is a prime number");
        }else{
            System.out.print("The Number is not a prime number");
        }
    }
}



// TRY THIS USEING FUNCTION CALL SEE THE CODE.