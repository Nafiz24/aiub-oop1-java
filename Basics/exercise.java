
import java.util.Scanner;



public class exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        do { 
            System.out.println("enter Number:");
            int num = sc.nextInt() ; 
            if(num < 0){
                break;
            }
        } while (true);

        System.out.println("The End");

    }
}
