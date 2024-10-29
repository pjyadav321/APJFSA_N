
//Main class to display the details of employees from Employee class
public class EmployeeTest {
    public static void main(String[] args) {
        // Creating an Employee object using the parameterized constructor
        Employee employee = new Employee(101, "John Doe", 30, 50000.00);

        // Printing employee details using the toString method
        System.out.println(employee);

        // Alternatively, you can print each field individually
        System.out.println("Employee ID: " + employee.getEmpID());
        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Employee Age: " + employee.getEmpAge());
        System.out.println("Employee Salary: " + employee.getEmpSalary());

        // Printing employee details using the toString method
        System.out.println(employee.toString());
    }
}
/*
    OUTPUT:
    Employee{empID=101, empName='John Doe', empAge=30, empSalary=50000.0}
    Employee ID: 101
    Employee Name: John Doe
    Employee Age: 30
    Employee Salary: 50000.0
    Employee{empID=101, empName='John Doe', empAge=30, empSalary=50000.0}
 */

