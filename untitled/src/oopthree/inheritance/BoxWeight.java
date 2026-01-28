package oopthree.inheritance;

public class BoxWeight extends Box{
    double weight ;
    BoxWeight(){
        super();
        this.weight = -10 ;
    }
    BoxWeight(double h , double w , double l , double weight){
//        this.h = h ;
//        this.w = w ;
//        this.l = l ;
        super(h,w,l); //Calls the Parent class Constructor...
        this.weight = weight ;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight = other.weight ;
    }
    void display(){
        System.out.println(this.h);
        System.out.println(this.w);
        System.out.println(this.l);
        System.out.println(this.weight);
    }
}
