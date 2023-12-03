import java.util.Scanner;

public class Sum_of_Odd_Even {
    
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the highest number: ");
            int x = input.nextInt();

            int sum1 = 0;

            System.out.println("\nPrint the sum of odd number");

            System.out.println("Method One");
            for(int i = 1; i<=x; i+=2){
                sum1 = sum1+i;
                System.out.println("Odd number: "+i);
             }
            System.out.println("Sum of Odd number: "+sum1); 

            System.out.println("Method Two");
            int sum2 = 0;
            for(int i = 1; i<=x; i++){
                if(i%2!=0){
                    sum2 +=i;
                    System.out.println("odd number: "+i);
                }
                
            }
            System.out.println("Sum of odd number another method: "+sum2); 


            int sum3 = 0;
            System.out.println("\n\nPrint the sum of even number");
            System.out.println("Method One");
            for(int i = 0; i<=x; i+=2){
                sum3 = sum3+i;
                System.out.println("Even number: "+i);
             }
            System.out.println("Sum of Even number: "+sum3); 
            int sum4 = 0;
            System.out.println("Method Two");
            for(int i = 0; i<=x; i++){
                if(i%2==0){
                    sum4 = sum4+i;
                    System.out.println("Even number: "+i);
                }
                
            }
            System.out.println("Sum of even number another method: "+sum4); 

        }

    }
}

