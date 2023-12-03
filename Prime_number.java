import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter any Possitive number: ");
            int x = input.nextInt();
            int count = 0;
            for(int i = 2; i<x; i++){
                if(x%i==0){
                    count++;
                    break;
                }
            }
            if(count==0){
                System.out.println("Prime Number.");
            }
            else{
                System.out.println("Not Prime.Please try again.");
            }
        }

    }
}
