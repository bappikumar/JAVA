import java.util.Scanner;

public class UserInput{
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " KG Coding ");

        System.out.println("Enter two value for addition");
        int a = input.nextInt();
        int b = input.nextInt();
        int result = a+b;
        System.out.println("Result = " +result);
    }
}