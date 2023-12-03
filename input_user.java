import java.util.Scanner;

public class input_user{

    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            int number;
            
            System.out.println("Enter any number: ");
            number = input.nextInt();

            System.out.println("Number= "+number);
        }


    }
    
}
