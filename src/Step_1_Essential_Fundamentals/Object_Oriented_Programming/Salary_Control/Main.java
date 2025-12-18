package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Salary_Control;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Manager("Luiza", 2300.00));
        employees.add(new Salesperson("Calos", 2000.00, 5000.00));

        for(Employee f : employees){
            System.out.println("employees: " + f.getName() + " | " + " Salary: " + f.calculateSalary());
        }
    }
}
