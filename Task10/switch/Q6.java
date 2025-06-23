import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter your Choise: ");
        int number = input.nextInt();

        System.out.print("Enter the first number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the Second number: ");
        int number1 = input.nextInt();

        String output = switch(number){
            case 1 -> "The Additon is : " + (number2 + number1);
            case 2 -> "The Subtraction is : " + (number2 - number1);
            case 3 -> "The Multiplication is : " + (number2 * number1);
            case 4 -> "The Multiplication is : " + (number2 / number1);
            default -> "Invalid Input";
        };
        System.out.print(output);
    }
}
