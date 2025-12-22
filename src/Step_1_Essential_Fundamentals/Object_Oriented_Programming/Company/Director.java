package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Company;

public class Director extends Employee implements Bonus{

    public Director(String name, double baseSalary){
        super(name, baseSalary);
    }

    @Override
    public double calculateBonus(){
        return (baseSalary * 1.25) + 5000.0;
    }

}
