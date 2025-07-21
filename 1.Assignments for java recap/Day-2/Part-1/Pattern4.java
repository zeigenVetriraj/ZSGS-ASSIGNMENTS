import java.util.Scanner;

// inside git

public class Pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of lines: ");
        int num = sc.nextInt(); // total lines like 5

        System.out.print("Enter '1' for character pattern or '0' for number pattern: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            System.out.print("Enter the character: ");
            char ch = sc.nextLine().charAt(0);
            
            int i = 1;
            while (i <= num) {
                int j = 1;
                int limit = (i <= (num / 2 + 1)) ? i : (num - i + 1);
				
                while (j <= limit) {
                    System.out.print(ch + " ");
                    j++;
                }
                System.out.println();
                i++;
            }

        } else {
            int val = 1;
            int i = 1;
            while (i <= num) {
                int j = 1;
                int limit = (i <= (num / 2 + 1)) ? i : (num - i + 1);
				
                while (j <= limit) {
                    System.out.print(val + " ");
                    val++;
                    j++;
                }
                System.out.println();
                i++;
            }
        }
    }
}
