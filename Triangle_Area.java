import java.util.Scanner;

public class Triangle_Area {
    
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the base: ");
            double base = input.nextInt();

            System.out.println("Enter the height: ");
            double height = input.nextInt();

            double area = 0.5 * base * height;

            System.out.println("Area = "+area);
        }

        

    }
}
