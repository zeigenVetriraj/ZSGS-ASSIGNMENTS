

//7. Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). Handle the exception in method1.

public class CatchMethodException {
    public static void main(String[] args) {
		method1();
	}
	
	public static void method1(){
		try{
			System.out.println(method2(12, 0));
		}
		catch(ArithmeticException e){
			System.out.println("Exception Catched in Method1 : ");
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public static int method2(int x,int y) throws ArithmeticException{
		return method3(x,y);
	}
	
	public static int method3(int x,int y) throws ArithmeticException{
		return x / y;
	}
}
