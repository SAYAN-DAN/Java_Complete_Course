import java.util.Scanner;

public class random_guess {
    public static void main(String[] args) {

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your guess number: ");
            int number = input.nextInt();
            int random = (int) Math.round(Math.random() * 100);
            System.out.println("random guess is : " + random);

            if (random == (number)) {
                System.out.println("Congratulations , Your guess is currect");
                break;
            }
        }
        System.out.println("Your guess is wrong");

    }

}
