package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Geometry_System;

public class Square implements Calculable{
    protected double side;

    public Square(double side){
        this.side = side;
    }


    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
