package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Company;

public class Developer extends Employee implements Bonus{

    public Developer(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateBonus() {
        return baseSalary * 0.1;
    }
}
