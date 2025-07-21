
/*
3. Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees.
*/
public class Problem3{
	public static void main(String[] args){
		Employee emp1 = new Employee();
		Employee emp2 = new Employee("Zeigen",0631,"20/09/2025",40000.00);
		Employee emp3 = new Employee(emp2);
		
		emp1.display();
		emp2.display();
		emp3.display();
	}
}
class Employee{
	String name;
	int employee_Id;
	String designation;
	double salary;
	
	public Employee(){
		name="";
		employee_Id=0;
		designation = "";
		salary = 7000.00;
		System.out.println("The Object has been created");
	}
	public Employee(Employee employee){
		this.name = employee.name;
		this.employee_Id = employee.employee_Id;
		this.designation = employee.designation;
		this.salary = employee.salary;
		System.out.println("The Object is Copied");
	}
	public Employee(String name, int employee_Id, String designation, double salary){
		this.name = name;
		this.employee_Id = employee_Id;
		this.designation = designation;
		this.salary = salary;
	}
	public void display(){
		System.out.println(name+" : "+employee_Id+" : "+designation+" : "+salary);
	}
}