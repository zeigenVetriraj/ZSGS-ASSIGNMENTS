import java.util.Scanner;
/*
3. Write a program to do the following patterns using while loop?
a)
      1    
    2   3   
  4   5   6
    7   8  
      9 
b)
w
w w
w w w
w w
w
*/
// inside git

public class Pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int num = sc.nextInt();

        sc.nextLine(); // consume newline

	System.out.print("Enter the character: ");
	char ch = sc.nextLine().charAt(0);
	
	int i = 1;
	while (i <= num) {
		int j = 1;
		int limit = (i <= (num / 2 + 1)) ? i : (num - i + 1);
		
		while (j <= limit) {
			System.out.print(ch + " ");
			j++;
		}
		System.out.println();
		i++;
	}

    }
}
