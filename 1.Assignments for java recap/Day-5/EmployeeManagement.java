
/*
3. Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.
 */
public class EmployeeManagement {
    public static void main(String[] args) {
        FullTimeEmployee fte = new FullTimeEmployee();
        double fullTimeSalary = fte.calculateSalary(50000);
        System.out.println("Full-Time Employee Salary: " + fullTimeSalary);

        PartTimeEmployee pte = new PartTimeEmployee();
        double partTimeSalary = pte.calculateSalary(100, 20);
        System.out.println("Part-Time Employee Salary: " + partTimeSalary);
    }
}


class Employee {
    public double calculateSalary(double baseSalary) {
        return baseSalary;
    }
}

class FullTimeEmployee extends Employee {
    @Override
    public double calculateSalary(double baseSalary) {
        return baseSalary;
    }
}


class PartTimeEmployee extends Employee {
	
    public double calculateSalary(double hourlyRate, int hoursWorked) {
        return hourlyRate * hoursWorked;
    }
}
