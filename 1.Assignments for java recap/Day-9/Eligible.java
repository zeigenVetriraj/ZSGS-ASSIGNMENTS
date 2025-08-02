

/*
1. Program to check if person is eligible to vote or not.
int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.
*/

public class Eligible {
    public static void main(String[] args) {
		int[] arr = {2, 5, 1, 4, 0, 7};
		
		try{
			int quotient = arr[7] / arr[4];
			
			System.out.println(quotient);
		}
		catch(IndexOutOfBoundsException e){
			System.out.println("See in the given array "+e.getMessage() );
		}
		catch(ArithmeticException e){
			System.out.println("Don't use '0' to divide values "+e.getMessage() );
		}
		catch(Exception e){
			System.out.println("Exception : "+e.getMessage() );
		}
	}
}
