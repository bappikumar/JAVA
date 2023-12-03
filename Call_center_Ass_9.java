import java.util.Scanner;

public class Call_center_Ass_9 {
    
    public static void main(String[] args) {
        
        System.out.println("Enter digit 1 t0 5: ");
        try (Scanner input = new Scanner(System.in)) {
            int digit  = input.nextInt();

            switch (digit) {
                case 1:
                    System.out.println("Bengali");
                    break;

                case 2:
                    System.out.println("Hindi");
                    break;

                case 3:
                    System.out.println("Urdu");
                    break;

                case 4:
                    System.out.println("English");
                    break;

                case 5:
                    System.out.println("Spanish");
                    break;
            
                default:
                    System.out.println("Wrong Selection.Please try again later.");
                    break;
            }
        }

        
    }
}
