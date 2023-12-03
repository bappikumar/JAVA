import java.util.Scanner;

public class Bitwise_Operator {
    
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
        
        int a, b, c;
        System.out.println("Enter any two Numbers: ");
        a = input.nextInt();
        b = input.nextInt();

        c = a & b;
        System.out.println("a & b = "+c);
        c = a | b;
        System.out.println("a | b = "+c);
        c = a ^ b;
        System.out.println("a ^ b = "+c);

        c = a>>3;
        System.out.println("a >> b = "+c);
        c = a<<3;
        System.out.println("a << b = "+c);

    }
}
}
