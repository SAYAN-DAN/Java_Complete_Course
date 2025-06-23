
import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner Interest = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        int prival = Interest.nextInt();

        System.out.print("Enter the Rate: ");
        float Rateval = Interest.nextFloat();

        System.out.print("Enter the Time: ");
        int Timeval = Interest.nextInt();

        float Interestval = (prival * Rateval * Timeval) / 100;
        System.out.print("The final interest is: "+Interestval);
    }
}
