

//5. Create a program where try block contains a return statement. Ensure that finally block executes before the method returns. Show this with output.

public class MethodWithFinally{
	public static void main(String[] args){
		System.out.println(number());
	}
	
	public static int number(){
		try{
			return 10;
		}
		finally{
			System.out.println("Finally block executed before returning!");
		}
	}
}
