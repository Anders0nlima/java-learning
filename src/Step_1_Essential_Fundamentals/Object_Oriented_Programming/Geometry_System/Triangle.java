package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Geometry_System;

public class Triangle implements Calculable {
    protected double sideA;
    protected double sideB;
    protected double sideC;
    protected double height;

    public Triangle(double sideA, double sideB, double sideC, double height){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((sideB * height)/2);
    }

    @Override
    public double calculatePerimeter() {
        return sideA + sideB + sideC;
    }
}
