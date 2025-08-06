import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

//1. Write a Java program to read the contents of a text file and display it on the console

public class ReadFileDemo{
	public static void main(String[] args){
		try(FileInputStream fis = new FileInputStream("Problem1.txt");){
            byte[] value = new byte[fis.available()];
            
            fis.read(value);
            
            String str = new String(value);

            System.out.println(str);
            

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
	}
}
