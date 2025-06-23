
import java.util.Scanner;

public class areaRectangle {
    public static void main(String[] args) {
        Scanner Triangle = new Scanner(System.in);
        System.out.print("Enter the Width: ");
        int Width = Triangle.nextInt();
        System.out.print("Enter the Height: ");
        int Height = Triangle.nextInt();

        float area = (float) 0.5 * Width * Height;
        System.out.print("The Area of the Triangle is: " + area);
    }
}
