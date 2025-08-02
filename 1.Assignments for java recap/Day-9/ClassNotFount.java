

//3. Write a program to illustrate how to throw a ClassNotFoundException.

public class ClassNotFount {
    public static void main(String[] args) {
		try{
			Class<?> emp = Class.forName("Employee");
            System.out.println("Class loaded: " + emp.getName());
			
			Class.forName("Student");
		}
		catch(ClassNotFoundException e){
			System.out.println("This is the Class Not Found Exception");
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
class Employee{
	
}
