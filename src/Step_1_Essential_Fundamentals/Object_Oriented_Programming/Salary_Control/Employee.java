package Step_1_Essential_Fundamentals.Object_Oriented_Programming.Salary_Control;

public abstract class Employee {
   protected String name;
   protected double baseSalary;

   public Employee(String name, double baseSalary){
       this.name = name;
       this.baseSalary = baseSalary;
   }

   public abstract double calculateSalary();

    public String getName() {
        return name;
    }
}
