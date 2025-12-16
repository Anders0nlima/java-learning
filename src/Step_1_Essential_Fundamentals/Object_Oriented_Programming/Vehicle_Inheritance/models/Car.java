package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Vehicle_Inheritance.models;

public class Car extends Vehicle{ //inheritance

    public Car(String mark, String model){
        super(mark, model);
    }

    @Override
    public void accelerate(){
        System.out.println("The car " + model + " is accelerating fast on four wheels!");
    }
}
