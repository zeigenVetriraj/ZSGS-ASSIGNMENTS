import java.util.Scanner;

/*
7. Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.
*/
public class SelectionnSort{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] weights = new int[10]; // storing the weight of 10 people
		
		//geting the weight in the array
		for(int i=0; i<10; i++){
			System.out.print("Enter the "+(i+1)+" Person weight : ");
			weights[i] = sc.nextInt();
		}
		
		selectionSort(weights);
		
		for(int x : weights){
			System.out.print(x+" ");
		}
	}
	public static void selectionSort(int[] weights){
		int n = weights.length;
		
		for(int i=0; i< n-1; i++){
			int maxindex = i;
			
			for(int j=i+1; j< n; j++){
				if(weights[j]>weights[maxindex]){
					maxindex = j;
				}
			}
			
			int temp = weights[maxindex];
			weights[maxindex] = weights[i];
			weights[i] = temp;
		}
	}
}