

//6. Develop a Java program to illustrate pass-by-value

public class PassByValue{
    public static void main(String[] args) {
		int x = 10;
		System.out.println("-------------------------------------\nBefore Passing : "+x);
		changePrimitive(x);//passing the value
		System.out.println("After Passing : "+x+"\n-------------------------------------");
		
		Student st = new Student("Ragu");
		System.out.println("-------------------------------------\nBefore Passing : "+st.name);
		changeObjectValue(st);//passing the referance of object
		System.out.println("After Passing : "+st.name+"\n-------------------------------------");
		System.out.println("-------------------------------------\nBefore Passing : "+st.name);
		changeObjectReferance(st);//passing the referance of object
		System.out.println("After Passing : "+st.name+"\n-------------------------------------");
		
	}
	
	// passing the primitive value
	public static void changePrimitive(int x){
		x = 20;
	}
	
	// passing the Object referance and change the object value
	public static void changeObjectValue(Student st){
		st.name = "kumar";
	}
	
	// passing the Object referance and changing object referance
	public static void changeObjectReferance(Student st){
		st = new Student("Raja");
	}
}

class Student{
	String name;
	
	public Student(String name){
		this.name = name;
	}
}
