package oopone;

public class clsandobj {

    public static void main(String[] args) {
        // Student Nafuu = new Student() ;
        // System.out.println(Nafuu.rno);
        // System.out.println(Nafuu.name);
        // System.out.println(Nafuu.marks);
        Student withoutConstructor = new Student();
        System.out.println(withoutConstructor.name);
        System.out.println(withoutConstructor.rno);
        System.out.println(withoutConstructor.marks);
        Student Siam= new Student(69 , "KHAMBACHODA" , 69.69f) ;
        System.out.println(Siam.rno);
        System.out.println(Siam.name);
        System.out.println(Siam.marks);

    }
}


class Student{
    int rno ;
    String name ;
    float marks;

    //we need a way to add the values of the above
    //properties object by object

    Student(){ //Default Constructor
        this.rno = 0 ;
        this.name = "unknown" ;
        this.marks = 0.0f ;
    }

    Student(int roll , String name , float marks){ //Parameterized Constructor
        this.rno = roll ;
        this.name = name ;
        this.marks = marks ;
    }
}

