import java.util.Scanner;

/*
7. Use both if and switch case statement  as two ways to find the grade of a student.
Percent>=85 && Percent<=100 Grade ‘A’
Percent>=70 Grade ‘B’
Percent>=50 Grade ‘C’
otherwise print ”Fail”
*/

public class Grade{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number : ");
        System.out.print("Enter the Percentage: ");
        int percent = sc.nextInt();

        // First Method: Using if-else
        System.out.print("Using if-else: ");
        if (percent >= 85 && percent <= 100) {
            System.out.println("Grade A");
        } else if (percent >= 70) {
            System.out.println("Grade B");
        } else if (percent >= 50) {
            System.out.println("Grade C");
        } else if (percent >= 0) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid Input");
        }

        // Second Method: Using switch-case (approximate using percent / 10)
        System.out.print("Using switch-case: ");
        switch (percent / 10) {
            case 10:
            case 9:
            case 8:
                System.out.println("Grade A");
                break;
            case 7:
                System.out.println("Grade B");
                break;
            case 6:
            case 5:
                System.out.println("Grade C");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Input");
        }
        
        
    }
}