package oopthree.properties.polymorphism;

public class Main {
    static void main(String[] args) {
        Shapes circle = new Circle() ;
        Shapes triangle = new Triangle() ;
        circle.area();
        triangle.area();
    }
}
