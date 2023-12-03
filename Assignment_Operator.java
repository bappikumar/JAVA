import java.util.Scanner;

public class Assignment_Operator {

    public static void main(String[] args){

        System.out.println("Enter Two Numbers: ");

        try (Scanner input = new Scanner(System.in)) {
            int x = input.nextInt();
            int y = input.nextInt();

            x += y;  //x = x+y
            System.out.println("X = "+x);

            x -= y;  //x = x-y
            System.out.println("X = "+x);

            x *= y;  //x = x*y
            System.out.println("X = "+x);

            x /= y;  //x = x/y
            System.out.println("X = "+x);

            x %= y;  //x = x%y
            System.out.println("X = "+x);
        }


        

    }
    
}
