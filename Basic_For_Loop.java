public class Basic_For_Loop {
    
    public static void main(String[] args) {
         
        for(int i=0; i<=10; i++){
            System.out.println(i+ " Bangladesh");
        }

        int k=0;
        while(k<=10){
            System.out.println(k+" India");
            k++;
        }

        int p=0;
        do{
            System.out.println(p+" China");
            p++;
        }while(p<=10);


        //Find sum of 1-10 using for loop
        int sum = 0;
        for(int i=0; i<=10; i++){
            sum = sum + i;
            System.out.println( " Final value: "+ sum);
        }


    }
}
