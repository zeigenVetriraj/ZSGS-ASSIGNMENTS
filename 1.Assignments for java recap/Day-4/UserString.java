import java.util.Scanner;

/*
6. Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub)A – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class. 
*/


public class UserString{
	public static void main(String[] args){
		MyString str1 = new MyString("helloWorld");
        MyString str2 = new MyString("World");

        System.out.println("Original: " + str1);
        System.out.println("Length: " + str1.length());
        System.out.println("CharAt(4): " + str1.charAt(4));
        System.out.println("Equals 'World': " + str1.equals(str2));
        System.out.println("To Upper Case: " + str1.toUpperCase());
        System.out.println("To Lower Case: " + str1.toLowerCase());
        System.out.println("Substring (0,5): " + str1.substring(0, 5));
        System.out.println("Concat with 'World': " + str1.concat(str2));
        System.out.println("Contains 'World': " + str1.contains(str2));
        System.out.println("Index of 'W': " + str1.indexOf('W'));
        System.out.println("Replace 'l' with 'x': " + str1.replace('l', 'x'));
	}
}
class MyString{
	private char[] data;
	
	//for String input
	public MyString(String str){
		data = new char[str.length()];
		for(int i=0; i<str.length(); i++){
			data[i] = str.charAt(i);
		}
	}
	//for Charecter array
	public MyString(char[] arr){
		data = new char[arr.length];
		for(int i=0; i<arr.length; i++){
			data[i] = arr[i];
		}
	}
	
	//returns length
	public int length(){
		return data.length;
	}
	
	//returns charcter at index
	public char charAt(int index){
		if(index<0 || index>=data.length){
			throw new IndexOutOfBoundsException();
		}
		return data[index];
	}
	
	//find if both objects are equal
	public boolean equals(MyString other){
		if(other.length()!=data.length)return false;
		for(int i=0; i<data.length; i++){
			if(other.charAt(i)!=data[i])return false;
		}
		return true;
	}
	
	//creating new MyString with the UpperCase data
	public MyString toUpperCase(){
		char[] res = new char[data.length];
		for(int i=0; i<data.length; i++){
			if(data[i]>='a' && data[i]<='z'){
				char c = (char)(data[i]-32);
				res[i] = c;
			}
			else res[i] = data[i];
		}
		return new MyString(res);
	}
	
	//creating new MyString with the LowerCase data
	public MyString toLowerCase(){
		char[] res = new char[data.length];
		for(int i=0; i<data.length; i++){
			if(data[i]>='A' && data[i]<='Z'){
				char c = (char)(data[i]+32);
				res[i] = c;
			}
			else res[i] = data[i];
		}
		return new MyString(res);
	}
	
	//creating new MyString with the start index and end index for new array
	public MyString substring(int start, int end){
		int len = end-start;
		char[] arr = new char[len];
		for(int i=0,j=start; i<len; i++,j++){
			arr[i] = data[j];
		}
		return new MyString(arr);
	}
	
	//creating new MyString with larger array of both MyString
	public MyString concat(MyString other){
		char[] arr = other.getCharArray();
		
		int len = data.length+arr.length;
		char[] result = new char[len];
		
		int i=0;
		while(i<data.length){
			result[i] = data[i++];
		}
		int j=0;
		while(i<len){
			result[i++] = arr[j++];
		}
		
		return new MyString(result);
	}
	
	// if the sequence of cherecters are thare in correct order
	public boolean contains(MyString sub){
		char[] arr = sub.getCharArray();
		for(int i=0; i<= data.length - arr.length; i++){
			int j=0;
			while(j<arr.length && data[i+j] == arr[j]) j++;
			
			if(j== arr.length)return true;
		}
		return false;
	}
	
	// if the charecter is present in what place it is on
	public int indexOf(char ch){
		for(int i=0; i<data.length; i++){
			if(data[i]==ch)return i;
		}
		return -1;
	}
	
	// if we find old character we will replace it with new character and return new MyString 
	public MyString replace(char oldChar, char newChar){
		char[] res = new char[data.length];
		for(int i=0; i<data.length; i++){
			if(data[i]==oldChar){
				res[i]=newChar;
			}
			else res[i]=data[i];
		}
		return new MyString(res);
	}
	
	// The stored data has to be returnd
	public char[] getCharArray(){
		return data;
	}
	
	// convert the data array to String and return
	public String toString(){
		return new String(data);
	}
}
