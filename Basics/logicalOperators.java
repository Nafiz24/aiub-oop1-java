
import java.util.Scanner;



public class logicalOperators {
    public static void main(String[] args) {
        /*Logical operators
            && = AND
            || = OR
            ! = Not
        */        

        int a = 10 ; 
        int b = 11 ; 
        if(a > 5 && b >10){
            System.out.println("BADDIE");
        }
        if(a > 5 || b >10){
            System.out.println("BADDIE");
        }
        System.out.println("Hello");

        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Your Cash:");
        float cash = sc.nextFloat() ; 
        // int pen = 10 ; 
        if(10 > cash){
            System.out.println("Sorry Fokinni");
        }else if(cash >10 && cash< 50){
            System.out.println("Still a Fokinni");
        }else{
            System.out.println("Borolok Hoitasos SUDANIRFUA");
        }
    }


}
