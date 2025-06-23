
import java.util.Scanner;
public class Check_number {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int numval = number.nextInt();

        if(numval == 0){
            System.out.println("The number is Zero");
        }
        else if(numval > 0){
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is Negative");
        }
    }
}
