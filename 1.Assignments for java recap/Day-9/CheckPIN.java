import java.util.Scanner;

/*
6. Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.
*/

public class CheckPIN {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Pasword : ");
		String str = sc.nextLine();
		
		checkAtmPin(str);
		sc.close();
	}
	
	public static void checkAtmPin(String str){
		
		if(str.length()!=4){
			System.out.println("The Must be 4 digits.");
			return;
		}else if(str.charAt(0)=='0'){
			System.out.println("The Paswrod Must not start with 0 .");
			return;
		}
		
		try{
			Integer.parseInt(str);
			System.out.println("Valid Input");
		}
		catch(Exception e){
			System.out.println("Every character must be number");
		}
	}
}
