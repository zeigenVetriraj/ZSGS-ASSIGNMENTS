import java.util.Scanner;

/*
7. Given a string s, return the number of segments in the string.
‌
A segment is defined to be a contiguous sequence of non-space characters.
‌
Example 1:
Input: s = "Hello, my name is John"
Output: 5
Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
‌
Example 2:
Input: s = "Hello"
Output: 1
‌
Constraints:
0 <= s.length <= 300
s consists of lowercase and uppercase English letters, digits, or one of the following characters "!@#$%^&*()_+-=',.:"
The only space character in s is ' '.
*/
public class Segment{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String Value : ");
		String str = sc.nextLine();
		
		
		System.out.println(noOfSegments(str));
	}
	public static int noOfSegments(String str){
		String[] s = str.split(" ");
		return s.length();
	}
}