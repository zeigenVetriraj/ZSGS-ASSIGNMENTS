
/*
4. Write a program to illustrate that Classes cannot be used for multiple Inheritance.
*/

public class MultipleInheritance{
	public static void main(String[] args){
		
		System.out.println("Example for the multiple Inheritance");
	
	}
}

class A{
	public display(){
		System.out.println("Class A");
	}
}
class B{
	public display(){
		System.out.println("Class B");
	}
}
/*
	This will cause the exception as java do not suport multiple inheritance with class
class c extends A, B{
	public display(){
		System.out.println("Class C");
	}
}
*/
