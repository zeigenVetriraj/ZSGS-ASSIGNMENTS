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

        sc.nextLine();// don't know why but some times when we take different input like string form int this has to be used

	System.out.print("Enter the character: ");
	char ch = sc.nextLine().charAt(0);
	
	int i = 1;
	while (i <= num) {
		int j = 1;
		
		//calculating number of times we have to print
		int limit = (i <= (num / 2 + 1)) ? i : (num - i + 1);
		
		while (j <= limit) {
			System.out.print(ch + " ");
			j++;
		}
		System.out.println();
		i++;
	}

	int val = 1;
	i=1;
	while(i<=num){
		
	//calculating number of times we have to print
	int limit = (i <= (num / 2 + 1)) ? i : (num - i + 1);
	
	//calculate number of spaces before
	int spaces = (num / 2 + 1 - limit);
	int s = 0;
	while (s < spaces) {
		System.out.print("  ");
		s++;
	}
	
	int j = 1;
	while (j <= limit) {
		System.out.print(val + "   ");
		val++;
		j++;
	}
		System.out.println();
		i++;
	}
        
    }
}
