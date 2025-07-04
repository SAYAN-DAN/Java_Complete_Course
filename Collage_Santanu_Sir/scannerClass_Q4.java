import java.util.Scanner;

public class scannerClass_Q4 {
    public static void main(String[] args) {
        int a;
        float b;
        char c;
        String s;
        double d;
        Boolean be;
        long L;
        String word;
        short S;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        s = input.nextLine();
        System.out.println("String: " + s);

        System.out.println("Enter a integer: ");
        a = input.nextInt();
        System.out.println("Integer is: "+a);

        System.out.println("Enter a Float: ");
        b= input.nextFloat();
        System.out.println("The float value is: "+ b);

        System.out.println("Enter character: ");
        c = input.next().charAt(0);
        System.out.println("The character is: "+ c);

        System.out.println("Enter True or False: ");
        be = input.nextBoolean();
        System.out.println("The output is: "+ be);

        System.out.println("Enter the double value: ");
        d = input.nextDouble();
        System.out.println("The Double value is: "+ d);

        System.out.println("Enter the long value: ");
        L = input.nextLong();
        System.out.println("The Long value is: "+ L);
        System.out.println("Enter the Short value: ");
        S = input.nextShort();
        System.out.println("The Short value is: "+ S);
        
        System.out.println("Enter the Single word: ");
        word = input.next();
        System.out.println("The Single word is: "+ word);

        }
}
