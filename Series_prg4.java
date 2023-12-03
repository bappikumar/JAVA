//Series: 1^1+2^2+3^3+4^4+ .......... + m^n


import java.util.Scanner;

public class Series_prg4 {
    public static void main(String[] args) {
         System.out.print("Enter the final number: ");
        try (Scanner input = new Scanner(System.in)) {
            int l = input.nextInt();
            int sum4 = 0;
            System.out.print("Series: ");
            for (int p = 1; p<=l; p++){
                sum4 = sum4+p*p;
                if(p==l){
                    break;
                }
                System.out.print(p+"^"+p);
                System.out.print("+");
             }
            System.out.print(" .......... + "+l);
            System.out.print("^");
            System.out.print(l);
            System.out.println("\nTotal sum of the series: "+sum4);
        }
    }
}
