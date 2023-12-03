import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        
        int x, y, n, sum;

        try (Scanner input = new Scanner(System.in)) {
            System.out.print("How many numbers: ");

             n = input.nextInt();
        }
        x = 0;
         y = 1;

         System.out.print(x+ " " +y);

         for(int i = 3; i <=n; i++){
            sum = x + y ;
            System.out.print(" "+sum);
            x = y;
            y = sum;

         }

    }
}