import java.util.Scanner;
import java.util.InputMismatchException; // has to import this Exception for using it

//2. Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform division, and catch the following exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception.

public class MultiCatch {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stringX,stringY;
		try{
			System.out.print("Enter the Value : ");
			stringX = sc.nextLine();
			System.out.print("Enter the Value : ");
			stringY = sc.nextLine();
			
			//converting to integers
			int intX = Integer.parseInt(stringX);
			int intY = Integer.parseInt(stringY);
			
			System.out.print("Enter the Divisior : ");
			int div = sc.nextInt();
			
			System.out.println("Division : "+(double)(intX+intY)/div);
		}
		catch(InputMismatchException e){
			System.out.println("Input type mismatch. Please enter valid numbers.");
		}
		catch(NumberFormatException e){
			System.out.println("Invalid number format. Enter integers only.");
		}
		catch(ArithmeticException e){
			System.out.println("Cannot divide by zero." );
		}
		catch(Exception e){
			System.out.println("Exception : "+e.getMessage() );
		}
	}
}
