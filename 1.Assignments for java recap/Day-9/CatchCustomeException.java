import java.util.Scanner;

//8. Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and display a login failure message.

public class CatchCustomeException {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the User Name : ");
		String userName = sc.nextLine();
		System.out.print("Enter the Password : ");
		String password = sc.nextLine();
		
		try{
			check(userName, password);
			System.out.println("Login Successful!");
		}
		catch(AuthenticationException e){
			System.out.println("Login Failed : "+e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void check(String userName, String password) throws AuthenticationException{
		String correctUser = "Zeigen";
        String correctPass = "1234abc";
		
		if(!correctUser.equals(userName))
			throw new AuthenticationException("Invalid User Name");
		if(!correctPass.equals(password))
			throw new AuthenticationException("Invalid Password");
	}
}

class AuthenticationException extends Exception {
	public AuthenticationException(String message){
		super(message);
	}
}
