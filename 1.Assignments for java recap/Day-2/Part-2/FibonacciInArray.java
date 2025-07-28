

//3. Write a program which generates 30 terms of Fibonacci no in an array and then prints it.
public class FibonacciInArray{
	public static void main(String[] args){
		
		int[] fibo = new int[30]; //creating the array to store the fibonacci values
		fibo[0] = 0;
		fibo[1] = 1;
		
		System.out.print("0 ");
		System.out.print("1 ");
		//storing the fibonacci value and printing
		for(int i=2; i<30; i++){
			fibo[i] = fibo[i-1] + fibo[i-2];
			System.out.print(fibo[i]+" ");
		}
		
		System.out.println("\nThe fibonacci numbers stored in array and printing it");
	}
}
