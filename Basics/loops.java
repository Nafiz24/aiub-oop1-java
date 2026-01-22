public class loops{
    public static void main(String[] args) {
        //1-100 -> forloop
        for(int i = 0 ; i <= 100 ; i++){
            System.out.println(i);
        }

        //1 - 100 while loop 
        int  i = 100 ; 
        while(i > 0){
            System.out.println(i);
            i-- ;
        }

        //1 - 100 do-while loop
        int k = 100 ; 
        do { 
            System.out.println(k); 
            k-- ; 
        }while(k > 0);
    }
}