package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Geometry_System;

public class GeometricProcessor {
    public static void process(Calculable form){
        System.out.println(form.calculateArea());
        System.out.println(form.calculatePerimeter());
    }
}
