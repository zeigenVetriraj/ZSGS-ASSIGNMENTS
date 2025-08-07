import java.io.*;
import java.util.Scanner;

/*
4. Write a Java program to append a text read from the user to an existing file without overwriting the original content.
*/

public class WriteFile{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the line to insert : ");
		String str = sc.nextLine();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("Problem4-file.txt",true))){
			bw.write(str);
			bw.newLine();
            System.out.println("Text appended successfully.");
		}
		catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
		catch (IOException e) {
            System.out.println(e.getMessage());
        }
		
		try(BufferedReader br = new BufferedReader(new FileReader("Problem4-file.txt"))){
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
		catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
		catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}
}
