import java.util.Scanner;

/*
8. We define the usage of capitals in a word to be right when one of the following cases holds:
1. All letters in this word are capitals, like "USA".
2. All letters in this word are not capitals, like "leetcode".
3. Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.
Example 1:
Input: word = "USA"
Output: true
‌
Example 2:
Input: word = "FlaG"
Output: false
‌
Constraints:
1 <= word.length <= 100
word consists of lowercase and uppercase English letters.
*/
public class UsageOfCapital{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String Value : ");
		String str = sc.nextLine();
		
		
		System.out.println(isCapitalUsageCorrect(str));
	}
	public static boolean isCapitalUsageCorrect(String str){
		int upper = 0;
		int len = str.length();
		if(len < 2)return true;
		for(int i=0; i<len; i++){
			char c = str.charAt(i);
			if(c>='A' && c<='Z')upper++;
		}
		
		char c = str.charAt(0);
		if(upper==len || (upper==1&&(c<='Z'&&c>='A')) || upper==0) return true;
		return false;
	}
}