import java.util.Scanner;

public class leapYear {

    public static void main(String[] args) {
        Scanner Year = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int numval = Year.nextInt();

        if ((numval % 4 == 0 && numval % 100 != 0) || (numval % 400 == 0)) {
            System.out.println("This Year is Leap Year");
        } else {
            System.out.println("This Year is not a Leap Year");
        }
    }
}
