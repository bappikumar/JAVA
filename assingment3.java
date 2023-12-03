import java.util.Scanner;

public class assingment3 {

    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter id: ");
            int id = input.nextInt();
            input.nextLine();

            System.out.print("Enter title: ");
            String title = input.nextLine();

            System.out.print("Enter price: ");
            String price = input.nextLine();

            System.out.print("Enter description: ");
            String description = input.nextLine();

            System.out.print("Enter category: \n");
            String category = input.next();
        

        System.out.println("Id: " +id);
        System.out.println("title: "+title);
        System.out.println("price: "+price);
        System.out.println("description: "+description);
        System.out.println("category: "+category);


    }
    
}

}
