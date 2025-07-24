import java.util.Scanner;
/*
2. Write a program to do the following patterns using for loop?
a) 1       1  R R R R
     1   1    R     R
       1      R R R R
     1   1    R   R
   1       1  R     R
*/
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

	//for the X pattern
        for(int i=0; i<num; i++){
		for(int j=0; j<num; j++){
			if(i==j || i+j==num-1)System.out.print("1 ");
			else System.out.print("  ");
		}
		System.out.println();
	}

	// Print R
	for(int i=0,k=0; i<num; i++){
		for(int j=0; j<num-1; j++){
			if(num%2==0){
				if(i==0 || i==num/2-1 || j==0 || (i<=num/2-1 && j==num-2) || (i>=num/2 && j==k))System.out.print("R ");
				else System.out.print("  ");

			}
			else{
				if(i==0 || i==num/2 || j==0 || (i<=num/2 && j==num-2)|| (i>=num/2-1 && j==k))System.out.print("R ");
				else System.out.print("  ");
			}
		}
		System.out.println();
		if(num%2==0 && i>=num/2)k++;
		else if(num%2==1 && i>=num/2-1)k++;
	}
    }
}
