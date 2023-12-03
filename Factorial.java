import java.util.Scanner;

public class Factorial {
    
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter any number: ");
            int x = input.nextInt();

            //Reverse Process
            int multiplication = 1;
            for(int i = 1; i<=x; i++){
                multiplication = multiplication * i;
                System.out.println(i);
           }
            System.out.println("Factorial: "+multiplication);

            //Normal Process
            int multiplication2 = 1;
              for(int i = x; i>=1; i--){
                multiplication2 = multiplication2 * i;
                System.out.println(i);
               
            }
            System.out.println("Factorial: "+multiplication2);

        }
    }
}
