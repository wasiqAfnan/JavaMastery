// create a class named "Employee" and declare 4 attributes as emp_id,emp_name,emp_position,emp_salary. after creating these variables declare and define a function that sets the value of these variables and also define a function that displays these details. After these steps create an object of the class and sets all these attributes and lastly print the values of these variables.

// Employee class
class Employee {
    // Attributes
    int emp_id;
    String emp_name;
    String emp_position;
    double emp_salary;

    // Function to set employee details
    public void setEmployeeDetails(int id, String name, String position, double salary) {
        this.emp_id = id;
        this.emp_name = name;
        this.emp_position = position;
        this.emp_salary = salary;
    }

    // Function to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee Position: " + emp_position);
        System.out.println("Employee Salary: " + emp_salary);
    }
}

public class oop10_Exercise {
    public static void main(String[] args) {
        // Create an object of the Employee class
        Employee emp = new Employee();

        // Set employee details using the function
        emp.setEmployeeDetails(101, "John Doe", "Software Engineer", 50000.50);

        // Display employee details using the function
        emp.displayEmployeeDetails();
    }
}