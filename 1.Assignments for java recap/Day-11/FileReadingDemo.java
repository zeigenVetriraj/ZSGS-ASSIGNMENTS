import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
3. Write a Java program that reads a file and prints the number of lines, words, and characters.
*/

public class FileReadingDemo{
	public static void main(String[] args){
		int lines=0,words=0,characters=0;
		try(
			BufferedReader br = new BufferedReader(new FileReader("Problem3-file.txt"))
		){
            String line;
            while ((line = br.readLine()) != null) {
                lines++;
				characters += line.length();
				words += line.trim().split(" ").length;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
		System.out.println("Number of Lines : "+lines);
		System.out.println("Number of Words : "+words);
		System.out.println("Number of Characters : "+characters);
	}
}
