import java.util.Scanner;

// 5. Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.

public class Even{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();

        int sum = 0;
        for(int i=1; i<=num; i++){
            if(i%2==1)continue;
            sum += i;
        }
        System.out.print(sum);
    }
}