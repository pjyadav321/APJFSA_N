// WAP to Create the bean class using employee details(EmpID, EmpName, EmpAge, EmpSalary)
public class Employee {
    // Private fields for encapsulation
    private int empID;
    private String empName;
    private int empAge;
    private double empSalary;

    // No-argument constructor
    public Employee() {
    }

    // Parameterized constructor
    public Employee(int empID, String empName, int empAge, double empSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    // Getter and Setter for empID
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    // Getter and Setter for empName
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Getter and Setter for empAge
    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    // Getter and Setter for empSalary
    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empID=" + empID +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", empSalary=" + empSalary +
                '}';
    }
}

