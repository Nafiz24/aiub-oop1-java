package oopone;

public class garbage {
    public static void main(String[] args) {
        final A nameAssign = new A("NAfuu") ;
        nameAssign.name = "Shiab" ;
        // nameAssign = new A("CHNA") ;  //Cant be assigned because of Final Keyword...

        A obj ;
        for(int i =0 ; i < 100 ; i++){
            obj = new A("Obj Created") ;
        }

    }
}

class A{
    final int a = 10 ;
    String name ;

    A(String name){
        // System.out.println("Object has been created!");
        this.name = name ;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object Is Destroyed!");
    }


}
