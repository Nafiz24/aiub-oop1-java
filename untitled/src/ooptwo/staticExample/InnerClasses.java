package ooptwo.staticExample;

public class InnerClasses {

    static class Test{
        String name ;
        public  Test(String name){
            this.name = name ;
        }
    }

    static void main(String[] args) {
        Test obj1 = new Test("Nafuu")  ;
        Test obj2 = new Test("Sudip")  ;

        System.out.println(obj1.name);
        System.out.println(obj2.name);


    }
}
