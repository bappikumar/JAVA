//Series: 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + ........ + n

import java.util.Scanner;

public class Series_prg {
    
    public static void main(String[] args) {
        
        System.out.print("Enter the 1st series final number: ");
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int sum = 0;
            System.out.print("Series: ");
            for (int i = 1; i<=n; i++){
                sum = sum+i;
                if(i==n){
                    break;
                }
                System.out.print(i+" + ");
             }
            System.out.print("........ + "+n);
            System.out.println("\nTotal sum of the series: "+sum);
        }
    }
}
        