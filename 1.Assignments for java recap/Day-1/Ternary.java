import java.util.Scanner;

//3. Write a program to find the maximum of two numbers using ternary operator.
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first Number : " );
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second Number : " );
        int num2 = sc.nextInt();
        
        // Using ternary operator to find the maximum
        int max = (num1 > num2) ? num1 : num2;

        System.out.println("The maximum of the two numbers is: " + max);
    }
}