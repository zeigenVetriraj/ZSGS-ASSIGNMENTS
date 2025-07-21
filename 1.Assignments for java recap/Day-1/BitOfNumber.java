import java.util.Scanner;

//8. Write a program to find the first set bit of a number?
public class BitOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        
        if(num%2!=0)System.out.println("First bit of number is in 1");
        else {
            int count = 1;
            while((num&1) != 1){
                count++;
                num = num>>1;
            }
            System.out.println("First bit of number is in "+count);
        }
    }
}