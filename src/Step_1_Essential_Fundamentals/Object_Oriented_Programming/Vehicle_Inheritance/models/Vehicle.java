package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Vehicle_Inheritance.models;

public class Vehicle {
    protected String mark;
    protected String model;

    public Vehicle(String mark, String model) {
        this.mark = mark;
        this.model = model;
    }

    public void accelerate(){
        System.out.println("The vehicle is accelerating.");
    }

}
