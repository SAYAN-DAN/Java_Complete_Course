import java.util.Scanner;

public class ageCalculator {
     public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int numval = number.nextInt();

        if(numval < 13){
            System.out.println("Below 13");
        }
        else if(numval < 20){
            System.out.println("Below 20");
        }
        else if(numval < 60){
            System.out.println("Below 60");
        }
        else{
            System.out.println("Above 60");
        }
    }
}
