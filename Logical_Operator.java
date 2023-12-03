import java.util.Scanner;

public class Logical_Operator {
    
    public static void main(String[] args) {
        
        //if both sides conditions are true, then AND(&&) will be work.
        //if one side condition is true, then OR(||) will be work.


        try (Scanner input = new Scanner(System.in)) {
            char ch;
            //String s;
            System.out.println("Enter any letter: ");
            ch = input.next().charAt(0); //a

            if (ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                System.out.println("Your given letter was Vowel\n");
            }

                else if(ch>='a' && ch<='z'){
                    System.out.println("Your given letter was Constant\n");
                }
                    else{
                        System.out.println("Not Find\n");
                }
            }

        }  

    }

