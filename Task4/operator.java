
import java.util.Scanner;
public class operator {
    public static void main(String[] argc){
        Scanner Number = new Scanner(System.in);
        System.out.print("Enter the first Number: ");
        int num1 = Number.nextInt();
        System.out.print("Enter the second Number: ");
        int num2 = Number.nextInt();  
         
        int num3 = num1 +num2;
        System.out.println("The addition of this two number is : " + num3);

        int num4 = num1 - num2;
        System.out.println("The Subtraction of this two number is : " + num4);

        int num5 = num1 * num2;
        System.out.println("The Multiplication of this two number is : " + num5);

        int num6 = num1 / num2;
        System.out.println("The Devision of this two number is : " + num6);

        int num7 = num1 % num2;
        System.out.println("The Remainder of this two number is : " + num7);
    }
}
