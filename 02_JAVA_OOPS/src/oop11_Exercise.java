// Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().

public class Employee {
    public void work() {
        System.out.println("Employee is working.");
    }

    public double getSalary() {
        return 30000.0;  // Default salary
    }
}

public class HRManager extends Employee {
    // Overriding the work() method
    @Override
    public void work() {
        System.out.println("HR Manager is handling recruitment and employee management.");
    }

    // New method specific to HRManager
    public void addEmployee(String employeeName) {
        System.out.println("New employee added: " + employeeName);
    }
}

public class oop11_Exercise {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp = new Employee();
        emp.work();
        System.out.println("Salary: $" + emp.getSalary());

        // Creating an HRManager object
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: $" + hr.getSalary());
        hr.addEmployee("John Doe");
    }
}

