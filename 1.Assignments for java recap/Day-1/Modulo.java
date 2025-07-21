import java.util.Scanner;

//7. Write a program to check if a number is a power of 2?
public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number : ");
        double n = sc.nextDouble();
        
         while(n>2){
            n /= 2;
        }
        if(n==2.00)System.out.println("The Number is power of 2");
        else System.out.println("The Number is not power of 2");
    }
}