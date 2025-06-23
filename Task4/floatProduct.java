
import java.util.Scanner;
public class floatProduct {
    public static void main(String[] argc){

       Scanner Floatval = new Scanner(System.in);
       System.out.print("Enter the first float value: ");
       float num1 = Floatval.nextFloat();

       System.out.print("Enter the Second float value: ");
       float num2 = Floatval.nextFloat();

       float num3 = num1 * num2;
       System.out.print("Thr product of  "+num1+" and "+num2+" is "+num3);
    }
}
