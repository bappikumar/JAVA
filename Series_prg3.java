//Series: 1.5 + 2.5 + 3.5 + 4.5 + 5.5 + 6.5 + 7.5 + 8.5 + 9.5 +  ........ + m

import java.util.Scanner;

public class Series_prg3 {
    public static void main(String[] args) {
        System.out.print("Enter the 3rd final number: ");
        try (Scanner input = new Scanner(System.in)) {
            float n3 = input.nextFloat();
            float sum3 = 0;
            System.out.print("Series: ");
            for (float k = 1.5f; k<=n3; k++){
                sum3 = sum3+k;
                if(k==n3){
                    break;
                }
                System.out.print(k+" + ");
             }
            System.out.print(" ........ + "+n3);
            System.out.println("\nTotal sum of the series: "+sum3);
        }

       

    }
}

