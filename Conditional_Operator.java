import java.util.Scanner;

public class Conditional_Operator {
    
    public static void main(String[] args) {
        
        //int x = 10;
        //int y = 30;
        //int large = (x>y) ? x : y;
        //System.out.println("Larger Number: "+large);

        // Ternary operator:   ? means if ,  : means else


        try (Scanner input = new Scanner(System.in)) {
            int number1, number2, large_value;
            System.out.println("Enter Two Numbers: ");

            number1 = input.nextInt();
            number2 = input.nextInt();

            large_value = (number1>number2) ? number1 : number2;
            System.out.println("Large Number: "+large_value);
        }



    }
}
