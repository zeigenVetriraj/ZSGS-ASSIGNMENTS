import java.util.Scanner;

// 6. Define a method to convert the decimal number to a binary number?

public class DecimalToBinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        String binary = "";

        while(num>0){
            int val = num%2;
            binary = val + binary;
            num /= 2;
        }
        System.out.println(binary);
    }
}