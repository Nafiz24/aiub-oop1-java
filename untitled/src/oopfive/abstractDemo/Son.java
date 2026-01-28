package oopfive.abstractDemo;

public class Son extends Parent{

    public Son(int age){
        super(age);
    }
    void career(){
         System.out.println("Wil be a Doctor");
     }
     @Override
     void partner(){
         System.out.println("In Love with RUMINa");
     }
}
