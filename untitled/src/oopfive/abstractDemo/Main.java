package oopfive.abstractDemo;

public class Main {
    static void main(String[] args) {
        Son son = new Son(12) ;
        son.career() ;
        Daughter daughter = new Daughter(43) ;
        daughter.career() ;
        System.out.println(daughter.age);
        Parent daughter1  = new Daughter(34) ;

    }
}
