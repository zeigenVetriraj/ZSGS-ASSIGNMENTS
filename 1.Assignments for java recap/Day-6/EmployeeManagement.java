
/*
3. Design a class`Employee with private data members: employee ID, name, designation, department, and monthly salary. Use proper getter and setter methods to access and update these fields. Add a method to calculate and return the annual salary of the employee.
*/

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee ragu = new Employee();

        ragu.setDetails("ZS-INC-06xx", "Ragu", "Tester", "QA", 40000.00);

        ragu.getDetails();
    }
}

class Employee {
    private String employeeID;
    private String name;
    private String designation;
    private String department;
    private double monthlySalary;

    public void setDetails(String employeeID, String name, String designation, String department, double monthlySalary) {
        this.employeeID = employeeID;
        this.name = name;
        this.designation = designation;
        this.department = department;
        this.monthlySalary = monthlySalary;
    }

    // Getter methods
    public String getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getDepartment() {
        return department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double calculateAnnualSalary() {
        return monthlySalary * 12;
    }

    public void getDetails() {
        System.out.println("----- Employee Details -----");
        System.out.println("Employee ID   : " + employeeID);
        System.out.println("Name          : " + name);
        System.out.println("Designation   : " + designation);
        System.out.println("Department    : " + department);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Annual Salary : " + calculateAnnualSalary());
        System.out.println("-----------------------------");
    }
}
