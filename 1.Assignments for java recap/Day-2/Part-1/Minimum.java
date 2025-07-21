import java.util.Scanner;

//1. Write a program that uses if statement to find the minimum of three numbers.
public class Minimum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the 2nd number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the 3rd number : ");
        int num3 = sc.nextInt();

        // checking the 3 numbers for minimum
        int res = (num1<num2)? (num1<num3)? num1 : num3 : (num2<num3)? num2 : num3;

        System.out.println(res);
    }
}