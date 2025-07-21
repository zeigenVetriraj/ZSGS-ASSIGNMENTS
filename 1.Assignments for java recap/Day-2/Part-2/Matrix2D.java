import java.util.Scanner;

/*
10. Write a menu driven program to do following operation on two dimensional array A of size m x n. You should use user-defined methods which accept 2-D array A, and its size m and n as arguments. The options are:
● To input elements into matrix of size m x n
● To display elements of matrix of size m x n
● Sum of all elements of matrix of size m x n
● To display row-wise sum of matrix of size m x n
● To display column-wise sum of matrix of size m x n
● To create transpose of matrix of size n x m
*/

public class Matrix2D {

    // Method to input matrix
    public static void inputMatrix(int[][] matrix, int m, int n, Scanner sc) {
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // Method to display matrix
    public static void displayMatrix(int[][] matrix, int m, int n) {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to calculate total sum
    public static void sumMatrix(int[][] matrix, int m, int n) {
        int total = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                total += val;
            }
        }
        System.out.println("Sum of all elements: " + total);
    }

    // Method to display row-wise sum
    public static void rowWiseSum(int[][] matrix, int m, int n) {
        System.out.println("Row-wise sum:");
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Row " + i + " sum: " + sum);
        }
    }

    // Method to display column-wise sum
    public static void colWiseSum(int[][] matrix, int m, int n) {
        System.out.println("Column-wise sum:");
        for (int j = 0; j < n; j++) {
            int sum = 0;
            for (int i = 0; i < m; i++) {
                sum += matrix[i][j];
            }
            System.out.println("Column " + j + " sum: " + sum);
        }
    }

    // Method to transpose matrix
    public static void transposeMatrix(int[][] matrix, int m, int n) {
        System.out.println("Transpose of the matrix:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Input Matrix");
            System.out.println("2. Display Matrix");
            System.out.println("3. Sum of all elements");
            System.out.println("4. Row-wise sum");
            System.out.println("5. Column-wise sum");
            System.out.println("6. Transpose Matrix");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inputMatrix(matrix, m, n, sc);
                    break;
                case 2:
                    displayMatrix(matrix, m, n);
                    break;
                case 3:
                    sumMatrix(matrix, m, n);
                    break;
                case 4:
                    rowWiseSum(matrix, m, n);
                    break;
                case 5:
                    colWiseSum(matrix, m, n);
                    break;
                case 6:
                    transposeMatrix(matrix, m, n);
                    break;
                case 7:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 7);
        
        sc.close();
    }
}
