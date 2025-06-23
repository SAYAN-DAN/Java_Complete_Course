import java.util.Scanner;

public class grade_Marks {
     public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int numval = number.nextInt();

        if(numval > 90){
            System.out.println("Above 90%");
        }
        else if(numval > 75){
            System.out.println("Above 75%");
        }
        else if(numval > 60){
            System.out.println("Above 60%");
        }
        else if(numval > 30){
            System.out.println("Above 30%");
        }
        else{
            System.out.println("Below 30%");
        }
    }
}
