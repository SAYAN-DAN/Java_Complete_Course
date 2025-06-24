import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        // float PI = (float)3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radious: ");
        int radious = input.nextInt();

        double area = Math.PI * (radious * radious);
        double circumference = 2 * Math.PI * radious;
        System.out.print("The area of the circle is: " + area);
        System.out.print("The circumference of the circle is: " + circumference);
    }
}
