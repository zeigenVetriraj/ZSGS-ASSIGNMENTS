import java.util.Scanner;

//4. Write a program to check whether the given two numbers are equal or not w/o using comparison operator?
public class EqualOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first Number : " );
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second Number : " );
        int num2 = sc.nextInt();
        
        // Using equals (==) operator
        int equal = num1 - num2;

        switch(equal){
            case 0:System.out.println("The two numbers is equal");
            break;
            default: System.out.println("The two numbers is not equal");
            break;
        }
        
    }
}