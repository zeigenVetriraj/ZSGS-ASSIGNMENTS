
 
/*
3. Create a Java application to manage employees in a company. Define an abstract class Employee with a method calculateSalary(). Then create two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime polymorphism by calling calculateSalary() on different types of employees using the Employee reference.
*/

public class EmployeeManagement {
    public static void main(String[] args) {
        // Runtime Polymorphism using Employee reference
        Employee emp1 = new FullTimeEmployee(50000);
        Employee emp2 = new PartTimeEmployee(200, 40); // pay = 200/hour, 40 hours

        System.out.println("Full Time Employee Salary: " + emp1.calculateSalary());
        System.out.println("Part Time Employee Salary: " + emp2.calculateSalary());
    }
}

abstract class Employee{
	abstract double calculateSalary();
}

class FullTimeEmployee extends Employee{
	double salary;
	
	public FullTimeEmployee(double salary){
		this.salary = salary;
	}
	
	public double calculateSalary(){
		return salary;
	}
}

class PartTimeEmployee extends Employee{
	double salary;
	
	public PartTimeEmployee(double pay, int hours){
		this.salary = pay * hours;
	}
	
	public double calculateSalary(){
		return salary;
	}
}
