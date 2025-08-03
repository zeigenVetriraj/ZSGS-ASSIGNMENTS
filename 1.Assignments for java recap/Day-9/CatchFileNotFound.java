import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

//9. Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.

public class CatchFileNotFound {
    public static void main(String[] args) {
		Scanner sc = null;
		try{
			sc = new Scanner(new File("Student.txt"));
			
			while(sc.hasNextLine()){
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found Exception : "+e.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally{
			if(sc!=null) sc.close();
		}
	}
}
