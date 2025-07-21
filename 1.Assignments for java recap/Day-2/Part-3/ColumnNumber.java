import java.util.Scanner;

/*
2. Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
‌
For example:
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
‌
Example 1:
Input: columnNumber = 1
Output: "A"
‌
Example 2:
Input: columnNumber = 28
Output: "AB"
‌
Example 3:
Input: columnNumber = 701
Output: "ZY"
‌
Constraints:
1 <= columnNumber <= 2^31 - 1
‌
*/

public class ColumnNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ColumnNumber: ");
        int num = sc.nextInt();

        System.out.println("Excel Column Title: " + columnNumber(num));
    }

    public static String columnNumber(int num) {
        String result = "";

        while (num > 0) {
            num--; // Shift to 0-based indexing
            int remainder = num % 26;
            char ch = (char) ('A' + remainder);
            result = ch + result;
            num = num / 26;
        }

        return result;
    }
}
