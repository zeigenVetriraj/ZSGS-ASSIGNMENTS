
//9. Write a class Employee with attributes empId, name, department and salary and define a parametrized constructor Employee(int empId, String name, String department, double salary) and assign these variables to instance variables accordingly and display them?

public class Employee{
    private int empId;
    private String name;
    private String department;
    private double salary;
    
    public Employee(int empId, String name, String department, double salary){
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void display(){
        System.out.println("Employee Id : "+empId);
        System.out.println("Name : "+name);
        System.out.println("Department : "+department);
        System.out.println("salary : "+empId);
    }

    public static void main(String[] args){
        Employee emp = new Employee(1, "Zeigen", "IT", 41287.59);
        emp.display();
    }
}