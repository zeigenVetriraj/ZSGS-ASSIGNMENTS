import java.util.Scanner;

/*
6. Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.
‌
You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.
‌
Example 1:
Input: num1 = "11", num2 = "123"
Output: "134"
‌
Example 2:
Input: num1 = "456", num2 = "77"
Output: "533"
‌
Example 3:
Input: num1 = "0", num2 = "0"
Output: "0"
‌
Constraints:
1 <= num1.length, num2.length <= 10^4
num1 and num2 consist of only digits.
num1 and num2 don't have any leading zeros except for the zero itself.
*/
public class StringNumberCalculation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num1 Value : ");
		String num1 = sc.nextLine();
		System.out.print("Enter num2 Value : ");
		String num2 = sc.nextLine();
		
		System.out.println(addNums(num1,num2));
	}
	public static String addNums(String num1, String num2){
		int i = num1.length()-1, j = num2.length()-1;
		int cary = 0;
		
		String result = "";
		while(i>=0 || j>=0 || cary!=0){
			int d1 = (i>=0)? num1.charAt(i)-'0' : 0;
			int d2 = (j>=0)? num2.charAt(j)-'0' : 0;
			
			int sum = d1 + d2 + cary;
			cary = sum/10; // to carry the first value if sum is > 9
			result = (char)((sum%10) + '0') +result; // have to add result back so brevesly calculated will be added
			
			i--;
			j--;
		}
		return result;
	}
}