package ooptwo.staticExample;

public class Main {
    public static void main(String[] args) {

        Human kunal = new Human(22 , "Kunal" , 23000 , false) ;
        Human nafiz = new Human(20 , "Nafiz" , 57000 , false);

        System.out.println(kunal.age);
        System.out.println(nafiz.name);
        System.out.println(nafiz.population);
    greeting() ;
    }

    static void greeting(){
        System.out.println("Greet");
    }
}


