
/*
6. Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.
*/
public class Problem6{
	public static void main(String[] args){
		Employee robert = new Employee("Robert",1994,80000.00,"64C- WallsStreat");
		Employee sam = new Employee("Sam",2000,40000.00,"68D- WallsStreat");
		Employee john = new Employee("John",1999,50000.00,"26B- WallsStreat");
		
		robert.display();
		sam.display();
		john.display();
	}
}
class Employee{
	String name;
	int yearOfJoining;
	double salary;
	String address;
	
	public Employee(String name, int yearOfJoining, double salary, String address){
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.address = address;
	}
	public void display(){
		System.out.println(name+" : "+yearOfJoining+" : "+address);
	}
}