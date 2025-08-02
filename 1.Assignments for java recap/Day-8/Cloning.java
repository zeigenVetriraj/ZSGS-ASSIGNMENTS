

//5. Write a program to illustrate the usage of clone() and find out what kind of copy it will make.

public class Cloning{

    public static void main(String[] args) {
		Address ad = new Address();
		Student s1 = new Student("Zeigen", 26, ad);
		
		try{
			Student s2 =(Student) s1.clone();
			
			s1.name = "Vetri";
			s1.ad.city = "Tenkasi";
			
			// both display methods show's Tenkasi that is why this is shallow copy the object stored in the class will only be copyd it referance.
			s1.display();
			s2.display();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
}

class Student implements Cloneable{
	String name;
	int age;
	Address ad;
	
	public Student(String name, int age, Address ad){
		this.name = name;
		this.age = age;
		this.ad = ad;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public void display(){
		System.out.println("Name : "+name);
		System.out.println("Age  : "+age);
		System.out.println("City : "+ad.city);
	}
}

class Address{
	String city = "Chennai";
	
}
