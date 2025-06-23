import java.util.Scanner;

public class GretestNumber {
      public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numval1 = number.nextInt();

        System.out.print("Enter the second number: ");
        int numval2 = number.nextInt();

        System.out.print("Enter the third number: ");
        int numval3 = number.nextInt();

        if((numval1 > numval2 ) && (numval1 > numval3)){
            System.out.println("First NUmber is Greatest and the number is: "+ numval1);
        }
        else if((numval2 > numval1 ) && (numval2 > numval3)){
            System.out.println("Second NUmber is Greatest and the number is: "+ numval2);
        }
        else{
            System.out.println("Third NUmber is and the number is: "+ numval3);
        }
    }
}
