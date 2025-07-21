import java.util.Scanner;

//1. Write a program that creates an integer array of 10 elements, accepts values of arrays and Find the sum of all odd numbers.
public class ArraySum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10]; //creating the array with the size of 10
		
		int sum = 0; // for calculating the odd values
		
		//accepting the values in the array
		for(int i=0; i<10; i++){
			System.out.print("Enter the "+(i+1)+" Number : ");
			arr[i] = sc.nextInt();
			if(arr[i]%2==1)sum += arr[i];
		}
		
		System.out.println("The sum of odd values in input are "+sum);
	}
}