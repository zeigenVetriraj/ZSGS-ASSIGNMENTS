import java.util.Scanner;

/*
4. Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array. Design a main() function to input size of the array ‘len' and single dimensional array of size 'len', and print the required result by invoking the function print( ).
*/
public class SumsInArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the array : ");
		int len = sc.nextInt();
		
		int[] nums = new int[len]; //creating the array
		
		//inputing the values
		for(int i=0; i<len; i++){
			System.out.print("Enter the "+(i+1)+" Value : ");
			nums[i]=sc.nextInt();
		}
		
		print(nums, len);
	}
	
	// creating the method to calculate two sums
	public static void print(int[] nums, int len){
		int singleNum = 0;
		int doubleNum = 0;
		
		for(int x : nums){
			int absVal = Math.abs(x);
			if(x<10)singleNum += absVal;
			else if(x<100)doubleNum += absVal;
		}
		System.out.println("The Singl Digit Sum is : "+singleNum);
		System.out.println("The Double Digit Sum is : "+doubleNum);
	}
}
