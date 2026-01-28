package oopfive.abstractDemo;

public class Daughter extends Parent{

    public Daughter(int age){
        super(age);
    }

    @Override
    void career() {
        System.out.println("I am a Doctor") ;
    }

    @Override
    void partner() {
        System.out.println("PIZZAA LOVE");
    }
}
