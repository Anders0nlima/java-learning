package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Vehicle_Inheritance;

import Step_1_Essential_Fundamentals.Object_Oriented_Programming.Vehicle_Inheritance.models.Car;
import Step_1_Essential_Fundamentals.Object_Oriented_Programming.Vehicle_Inheritance.models.Motorcycle;
import Step_1_Essential_Fundamentals.Object_Oriented_Programming.Vehicle_Inheritance.models.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("Chevrolet", "Onix");  //Polymorphism
        Vehicle vehicle2 = new Motorcycle("Honda", "XL750 Transalp"); //Polymorphism

        vehicle1.accelerate();
        vehicle2.accelerate();
    }
}
