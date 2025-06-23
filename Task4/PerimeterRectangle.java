
import java.util.Scanner;
public class PerimeterRectangle {
     public static void main(String[] args) {
        
        Scanner recval = new Scanner(System.in);
        System.out.print("Enter the first val: ");
        int val1 = recval.nextInt();

        System.out.print("Enter the second val: ");
        int val2 = recval.nextInt();

        System.out.print("Enter the third val: ");
        int val3 = recval.nextInt();

        System.out.print("Enter the fourth val: ");
        int val4 = recval.nextInt();


        int val5 = val1+val2+val3+val4;
        System.out.print("The Perimeter of a rectangle is : "+ val5);
     }
}
