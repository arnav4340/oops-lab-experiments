class Employee {
    private String name;
    private int empid;
    private double salary;

    
    public Employee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

    
    public Employee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    
   


    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }

    
    public void displayDetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}


class Manager extends Employee {
    private String department;

    
    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}


public class EmployeeTest {
    public static void main(String[] args) {
        
        Employee emp = new Employee("Alice", 101, 50000);
        System.out.println("Before Salary Increase:");
        emp.displayDetails();

        
        emp.increaseSalary(10);
        System.out.println("\nAfter 10% Salary Increase:");
        emp.displayDetails();

        
        Manager mgr = new Manager("Bob", 102, 70000, "IT");
        System.out.println("\nManager Details:");
        mgr.displayDetails();

        
        mgr.increaseSalary(15);
        System.out.println("\nAfter 15% Salary Increase:");
        mgr.displayDetails();
}
}
