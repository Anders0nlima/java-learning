package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Company;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    protected Director director;
    List<Employee> employees = new ArrayList<>();

    public Department(String name, String directorName, double directorSalary){
        this.name = name;
        this.director = new Director(directorName, directorSalary);

    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    public void calculateTotalBonus() {
        double total = 0;

        total += director.calculateBonus();

        for(Employee e : employees){
            if (e instanceof Bonus){
                Bonus b = (Bonus) e;
                total += b.calculateBonus();
            }
        }

        System.out.println("Total department bonus " + name + " : R$ " + total);

    }

}
