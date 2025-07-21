

/*

1. Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
*/
public class Student{
	String name;
	int roll_no;
	
	public static void main(String[] args){
		Student student = new Student();
		student.name = "John";
		student.roll_no = 2;
		System.out.println(student.name+" : "+student.roll_no);
	}
}