package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Geometry_System;

public class Main {
    public static void main(String[] args) {
        Calculable mySquare = new Square(2);
        Calculable myTriangle = new Triangle(5, 6, 5, 4);

        System.out.println(myTriangle.calculateArea());
        System.out.println(myTriangle.calculatePerimeter());

        System.out.println(mySquare.calculateArea());
        System.out.println(mySquare.calculatePerimeter());
    }
}
