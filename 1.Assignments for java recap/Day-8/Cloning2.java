

/*
8. Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable
*/

public class Cloning2{
    public static void main(String[] args) {
		try{
			Student student = new Student("Vetri", 26);
			Student cloneStudent = (Student)student.clone();
			
			cloneStudent.display();
		}
		catch(Exception e){
			System.out.println("Error with Cloning : "+e.getMessage());
		}
		
		try{
			Parent parent = new Parent("Rahul", 26);
			Parent cloneParent = (Parent)parent.clone();
			
			cloneParent.display();
		}
		catch(Exception e){
			System.out.println("Error with Cloning : "+e.getMessage());
		}
		
	}
}

class Student implements Cloneable{
	String name;
	int age;
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public void display(){
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
	}
}

class Parent{
	String name;
	int age;
	
	public Parent(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public void display(){
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
	}
}
