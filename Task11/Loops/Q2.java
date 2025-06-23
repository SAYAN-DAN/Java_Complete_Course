import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5, guess;

        do {
            System.out.print("Please Enter the number: ");
            guess = input.nextInt();
        } while (num != guess);
        System.out.print(" Congratulations, You Successfully guesss the number");
    }
}
