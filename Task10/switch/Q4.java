import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the  Score: ");
        int Score = input.nextInt();

        String result = Score > 80 ? "High" : Score >= 50 ? "Moderate" : "Low";
        System.out.print("The result of the student is:  " + result);
    }
}
