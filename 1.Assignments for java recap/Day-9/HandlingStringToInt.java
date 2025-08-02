import java.util.Scanner;

//4. Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.

public class HandlingStringToInt {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value : ");
		String str = sc.nextLine();
		try{
			int num = Integer.parseInt(str);
			System.out.println("The Square value of number "+num+" is " +(num*num));
		}
		catch(NumberFormatException e){
			System.out.println("Can't convert to Number "); // throw exception when contains letters, decimal point, special chars, or is out of integer range
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}
