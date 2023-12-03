import java.util.Scanner;


//import all java math from "https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html"

public class Math {
    
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
        
        int x, y;
        System.out.println("Enter two numbers: ");

        x = input.nextInt();
        y = input.nextInt();

        int max = java.lang.Math.max(x, y);
        System.out.println("Max: "+max);

        int min = java.lang.Math.min(x, y);
        System.out.println("Min: "+min);

        int ab = java.lang.Math.abs(y);
        System.out.println("Absolute: "+ab);

        double power = java.lang.Math.pow(x, y);
        System.out.println("Power: "+power);
    }
}
}
