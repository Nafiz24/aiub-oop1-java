
import java.util.Scanner;

public class miniProject {
    public static void main(String[] args) {
        int myRandom = (int)(Math.random() * 100 ); 
        int userNumber = 0 ; 
        Scanner sc = new Scanner(System.in) ; 
        do{

            System.out.println("Guess the Number:"); 
            userNumber = sc.nextInt() ;
            if(userNumber == myRandom){
                System.out.println("HURRAYYY! YOU DID IT...");
                break;
            }else if(userNumber < myRandom){
                System.out.println("Sorry It's a greater Number...");

            }else{
                System.out.println("Number is Smaller! Think Big...");
            }
        } while(userNumber >= 0 ) ; 
    }
}
