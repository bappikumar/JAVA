public class assignment2 {

    public static void main(String[] args) {
        int id = 1001;
        String title = "The star";
        Double Price = 1002.02;
        String description = "The author of the book is Mr. Bappi Kumar. He is a Bangladeshi poet. He loves to write.";
        char category = 'A';

        System.out.println("ID: " +id);
        System.out.println("Title: " +title);
        System.out.println("Price: " +Price +" Tk");
        System.out.println("Description: " +description);
        System.out.println("Category: " +category);


        //format specifier
        int id2 = 1002;
        float Price2 = 1002.0552f;
        System.out.printf("int id2 = %d\n", id2);
        System.out.printf("float price2 = %.2f", Price2);


    }
    
}
