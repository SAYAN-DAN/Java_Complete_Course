
import java.util.Scanner;
public class Compoundinterest {
    public static void main(String[] args) {
        Scanner Compund = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        int prival = Compund.nextInt();

        System.out.print("Enter the Rate: ");
        float Rateval = Compund.nextFloat();

        System.out.print("Enter the Time: ");
        int Timeval = Compund.nextInt();

        float CompundVal = prival * (1+ Rateval/100 ) * Timeval;
        System.out.print("The final interest is: "+CompundVal);
    }
}
