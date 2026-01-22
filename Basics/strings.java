public class strings{
    public static void main(String[] args){
        //Concatenation 
        String name1 = "Nafuu" ; 
        String name2 = "Bafuu" ; 
        String newName = name1 + " and " +  name2 ; 
        System.out.println(newName);
        // charAt 
        String name3 = "Bafuu" ; 
        System.out.println(name3.charAt(0));
        //replace 
        String name4 = "Nafuu" ; //not immutable
        String name5 = name4.replace("f", "z") ;
        System.out.println(name5);

    }
}