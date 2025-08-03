import java.util.Scanner;

//10. Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. Use a custom exception to handle the scenario when an ineligible person tries to register for voting. Display appropriate messages for eligible and ineligible voters.

public class VotersCheck {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Age : ");
		
		try{
			int age = sc.nextInt();
			checkEligibility(age);
			System.out.println("Yor're eligible to vote!");
		}
		catch(EligibilityException e){
			System.out.println("You're not eligible: "+e.getMessage());
		}
		catch(Exception e){
			System.out.println("Invalid input:  : "+e.getMessage());
		}
	}
	
	public static void checkEligibility(int age) throws EligibilityException{
		if(age<18) throw new EligibilityException("Must be at least 18 years old.");
		if(age>120) throw new EligibilityException("Invalid age entered (too high).");
	}
}

class EligibilityException extends Exception {
	public EligibilityException(String message){
		super(message);
	}
}
