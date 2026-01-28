package oopthree.inheritance;

public class BoxPrice extends BoxWeight{
    double cost ;

    BoxPrice(){
        super();
        this.cost = -1 ;
    }
    BoxPrice(BoxPrice other){
        super(other);
        this.cost = other.cost ;
    }

    BoxPrice(double h , double w , double l , double weight , double cost){
//        this.h = h ;
//        this.w = w ;
//        this.l = l ;
        super(h,w,l , weight); //Calls the Parent class Constructor...
        this.cost = cost ;
    }
}
