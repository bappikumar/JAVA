import java.util.Scanner;

public class Multiplication_Process {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter any initial number for multiplication process: ");
            int m = input.nextInt();
            System.out.print("Enter any final number for multiplication process: ");
            int x = input.nextInt();

            for(int i = m; i<=x;i++){
                System.out.println();
                for(int j=1;j<=10;j++){
                    System.out.print(i+" * " +j);
                    System.out.print(" = ");
                    System.out.print(i*j);
                    System.out.println();
                }
            }
            
    }
}
}
