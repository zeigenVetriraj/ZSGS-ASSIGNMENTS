import java.util.Scanner;

/*
8. Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
*/
public class NumberOfAdult{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[] ages = new int[10]; // storing the age of 10 people
		
		//geting the age in the array
		for(int i=0; i<10; i++){
			System.out.print("Enter the "+(i+1)+" Person Age : ");
			ages[i] = sc.nextInt();
		}
		
		int under18=0,between18to60=0,above60=0;
		for(int x: ages){
			if(x<18)under18 += x;
			else if(x<=60)between18to60 += x;
			else above60 += x;
		}
		
		System.out.println("The number of people under 18 are "+under18);
		System.out.println("The number of people who is in 18-60 are "+between18to60);
		System.out.println("The number of people above 60 are "+above60);
	}
}
