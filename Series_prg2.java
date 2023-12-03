//Series: 1.0 + 3.0 + 5.0 + 7.0 + 9.0 +  .......... + m

import java.util.Scanner;

public class Series_prg2 {
    public static void main(String[] args) {
        System.out.print("Enter the 2nd final number: ");
        try (Scanner input = new Scanner(System.in)) {
            double m = input.nextInt();
            double sum2 = 0;
            System.out.print("Series: ");
            for(double j = 1; j<=m; j+=2){
                sum2 = sum2+j;
                if(j==m){
                    break;
                }
                System.out.print(j+" + ");
             }
            System.out.print(" .......... + "+m);
            System.out.println("\nTotal sum of the series: "+sum2);
        }

    }
}       
