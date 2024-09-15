import java.util.Scanner;

public class Argument_Parameter{
    private static int num1;
    private static int num2;

    public static void main(String[] args) {
      result(5,7);
        
    }

   /* public static void inputNumber(int num1, int num2){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Number: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
    }
*/ 
    public static int result(int num1, int num2){
        int sum = num1 + num2;
       
        System.out.println("Sum of result: " + sum);
        return sum;
    }
}