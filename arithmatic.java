import java.util.Scanner;

public class arithmatic{
    public static void main(String[] args){

        System.out.println("Enter two numbers: ");
        try (Scanner input = new Scanner(System.in)) {
            int x = input.nextInt();
            int y = input.nextInt();

            int result = x + y;
            System.out.println("Addition = "+result);

            result = x - y;
            System.out.println("Substraction = "+result);

            result = x * y;
            System.out.println("Multiplication = "+result);

            double result2 = (double) x / y;
            System.out.println("Divider = "+result2);

            result = x % y;
            System.out.println("Reminder = "+result);
        }
    }
}