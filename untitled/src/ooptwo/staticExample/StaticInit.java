package ooptwo.staticExample;

public class StaticInit {
    static int a = 4 ;
    static int b ;

    static {
        System.out.println("Static Block called: ");
        b = a * 4 ;
    }

    static void main(String[] args) {
        StaticInit obj1 = new StaticInit() ;
        System.out.println(obj1.a + " + " + obj1.b);
        System.out.println(b+=3) ;
        StaticInit obj2 = new StaticInit() ;
        System.out.println(obj1.a + " + " + obj1.b);
    }


}
