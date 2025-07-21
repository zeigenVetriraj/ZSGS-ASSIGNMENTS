import java.util.Scanner;

//2. Write a program to take in 10 values and print only those numbers which are prime.
public class FindPrime{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10]; //creating the array with the size of 10
		
		//accepting the values
		for(int i=0; i<10; i++){
			System.out.print("Enter the "+(i+1)+" Number : ");
			int temp = sc.nextInt();
			if(isPrime(temp)){
				arr[i]=temp;
			}
		}
		for(int x : arr){
			if(x>0)System.out.print(x+" ");
		}
		
		System.out.println("\nThe prime values int the data ");
	}
	
	// for finding the value is prime or not
	public static boolean isPrime(int num){
		if(num<2)return false;
		if(num<==2)return true;
		if(num%2==0)return false;
		
		for(int i=3; i*i<=num; i++){
			if(num%i==0)return false;
		}
		return true;
	}
}