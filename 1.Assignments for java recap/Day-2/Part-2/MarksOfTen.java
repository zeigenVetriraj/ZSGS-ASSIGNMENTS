import java.util.Scanner;

/*
9. Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.
*/
public class MarksOfTen{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int[][] students = new int[10][4]; // storing 10 people's mark and roll-number
		
		//geting the roll-number and marks
		for(int i=0; i<10; i++){
			for(int j=0; j<4; j++){
				if(j==0){
					System.out.print("Enter the Roll Number : ");
					students[i][j] = sc.nextInt();
				}else{
					System.out.print("Enter the "+(i)+" Mark : ");
					students[i][j] = sc.nextInt();
				}
			}
			
		}
		
		System.out.println("\nThe Result");
		//printing the Values
		for(int i=0; i<10; i++){
			System.out.println("Roll Number : "+students[i][0]+" Total Mark : "+(students[i][1]+students[i][2]+students[i][3]));
		}
	}
}