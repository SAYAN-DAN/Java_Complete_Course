
import java.util.Scanner;
public class function {
    public static void main(String[] args) {
        int num1 =takeinput();
        int num2 =takeinput();
        int result = sum(num1 , num2);
        System.out.println("The sum of two numberb is: " + result);
    }

    public static int takeinput(){
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the first value: ");
        int num1 = number.nextInt();
        return num1;
    }

   public static int sum(int a , int b){
      return a +b;
   }
}
