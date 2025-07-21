import java.util.Scanner;

/*
1. Given two binary strings a and b, return their sum as a binary string.
Input: a = "11", b = "1"
Output: "100"
‌
Input: a = "1010", b = "1011"
Output: "10101"
‌
Constraints:
1 <= a.length, b.length <= 10^4
a and b consist only of '0' or '1' characters.
Each string does not contain leading zeros except for the zero itself.
*/
public class AddBinary{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first Binary Value : ");
		String a = sc.next();
		System.out.print("Enter the second Binary Value : ");
		String b = sc.next();
		
		System.out.println(addBinary(a,b));
	}
	public static String addBinary(String a, String b){
		String result = "";
		int i = a.length() - 1, j = b.length() - 1;
		int carry = 0;

		while (i >= 0 || j >= 0 || carry != 0) {
			int d1 = (i >= 0) ? (a.charAt(i) - '0') : 0;
			int d2 = (j >= 0) ? (b.charAt(j) - '0') : 0;

			int sum = d1 + d2 + carry;

			if (sum == 0) {
				result = '0' + result;
				carry = 0;
			} else if (sum == 1) {
				result = '1' + result;
				carry = 0;
			} else if (sum == 2) {
				result = '0' + result;
				carry = 1;
			} else { // sum == 3
				result = '1' + result;
				carry = 1;
			}
			i--;
			j--;
		}
		return result;
	}
}