package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Salary_Control;

public class Salesperson extends Employee{
    protected double sales;

    public Salesperson(String name, Double baseSalary, double sales){
        super(name, baseSalary);
        this.sales = sales;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + (sales * 1.05);
    }
}
