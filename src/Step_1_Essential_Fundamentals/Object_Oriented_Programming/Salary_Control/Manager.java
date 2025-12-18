package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Salary_Control;

public class Manager extends Employee{

    public Manager(String name, double baseSalary){
        super(name, baseSalary);
    }
    @Override
    public double calculateSalary() {
        return baseSalary + 1000.0;
    }
}
