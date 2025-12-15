package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Area_Calculation;

public class GeometricCalculator {

    public int CalculateAreaOfRectangle(int height, int width){
        return height * width;
    }

    public static double CalculateAreaOfCircle(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
}
