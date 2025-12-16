package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Vehicle_Inheritance.models;

public class Motorcycle extends Vehicle{

    public Motorcycle(String mark, String model){
        super(mark, model);
    }

    @Override
    public void accelerate(){
        System.out.println("The motorcycle " + model + " is popping a wheelie and accelerating!");
    }

}
