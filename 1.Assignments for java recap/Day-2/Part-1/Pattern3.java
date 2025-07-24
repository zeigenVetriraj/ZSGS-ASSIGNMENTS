import java.util.Scanner;
/*
4. Write a program to do the following patterns using do...while loop?
a) Pascal Triangle
b) ZOHO
CORP
ORAT
IONS
*/
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of rows for Pascal Triangle: ");
        int n = sc.nextInt();

        int i = 0;
        do {
            // Print spaces
            int space = 1;
            do {
                if (space > n - i) break;
                System.out.print(" ");
                space++;
            } while (true);

            int val = 1;
            int j = 0;
            do {
                if (j > i) break;
                System.out.print(val + " ");
                val = val * (i - j) / (j + 1);
                j++;
            } while (true);

            System.out.println();
            i++;
        } while (i < n);

        sc.nextLine();

        //next question to seperate string in 4 charpattern
		System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int len = str.length();
        
        int rowLength = 4; // number of characters
        i = 0;
        do {
            int j = 0;
            do {
                if (i >= len || j >= rowLength) break;
                System.out.print(str.charAt(i));
                i++;
                j++;
            } while (true);
            System.out.println();
        } while (i < len);
    }
}
