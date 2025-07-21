
/*
2. Create a class named Student that has the following attributes:
name (String)
roll_no (int)
phone_no (int)
address (String)
Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively.
*/
public class Problem2{
	public static void main(String[] args){
		Student sam = new Student("Sam",1,"9234567890","10/8 saligramam");
		Student john = new Student("John",2,"9256875692","23 street Thenkasi");
		
		System.out.println(sam.name+" : "+sam.roll_no+" : "+sam.phone_no+" : "+sam.address);
		System.out.println(john.name+" : "+john.roll_no+" : "+john.phone_no+" : "+john.address);
	}
}
class Student{
	String name;
	int roll_no;
	String phone_no;
	String address;
	
	public Student(String name, int roll_no, String phone_no, String address){
		this.name = name;
		this.roll_no = roll_no;
		this.phone_no = phone_no;
		this.address = address;
	}
}