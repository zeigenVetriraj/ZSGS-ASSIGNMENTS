import java.util.Scanner;

/*
3. Given a string s, reverse only all the vowels in the string and return it.
‌
The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
‌
Example 1:
Input: s = "hello"
Output: "holle"
‌
Example 2:
Input: s = "leetcode"
Output: "leotcede"
‌
Constraints:
1 <= s.length <= 3 * 10^5
s consist of printable ASCII characters.
*/
public class ReverseVowels{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		
		System.out.println(reverseVowels(str));
	}
	public static String reverseVowels(String str){
		char[] ch = str.toCharArray();
		int i=0, j=str.length()-1;
		while(i<j){
			while(i<j && !isVowel(ch[i]))i++; // incrementing to vowel
			while(i<j && !isVowel(ch[j]))j--; // decrementing to vowel
			//swaping vowel
			char temp = ch[i];
			ch[i++] = ch[j];
			ch[j--] = temp;
		}
		return new String(ch);
	}
	// checking if the character is vowel
	public static boolean isVowel(char c){
		return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U');
	}
}