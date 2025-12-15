package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Area_Calculation;

public class Main {
    public static void main(String[] args) {
        GeometricCalculator geometricCalculator = new GeometricCalculator();

        double rectangle1 = geometricCalculator.CalculateAreaOfRectangle(10, 5);
        System.out.println(rectangle1); //1. Instance Method Call (using the object)

        double circle1 = GeometricCalculator.CalculateAreaOfCircle(12);
        System.out.println(circle1); //2. Calling the Static Method (using the Class Name)
    }
}
