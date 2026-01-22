public class exceptHandling {
    public static void main(String[] args) {
        int[] marks = {1,2,3,4,5} ; 
        try{

            System.out.println(marks[7]);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Hello World");
    }
}
