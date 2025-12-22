package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Company;

public class Main {
    public static void main(String[] args) {
        Department department = new Department("Tec", "Ana", 1500.0);

        Developer developer1 = new Developer("Anderson", 600.0);
        Developer developer2 = new Developer("Carlos", 400.0);

        department.addEmployee(developer1);
        department.addEmployee(developer2);

        department.calculateTotalBonus();
    }
}
