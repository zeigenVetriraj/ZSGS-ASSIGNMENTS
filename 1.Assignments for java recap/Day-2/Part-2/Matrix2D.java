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

    public static void inputMatrix(int[][] matrix, int m, int n, Scanner sc) {
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Element[" + i + "][" + j + "]: ");
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    public static void displayMatrix(int[][] matrix, int m, int n) {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void sumMatrix(int[][] matrix, int m, int n) {
        int total = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                total += val;
            }
        }
        System.out.println("Sum of all elements: " + total);
    }

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

        inputMatrix(matrix,m,n,sc);
		
		System.out.println("-----------------------------------");
		displayMatrix(matrix, m, n);
		
		System.out.println("-----------------------------------");
		sumMatrix(matrix, m, n);
		
		System.out.println("-----------------------------------");
		rowWiseSum(matrix, m, n);
		
		System.out.println("-----------------------------------");
		colWiseSum(matrix, m, n);
		
		System.out.println("-----------------------------------");
		transposeMatrix(matrix, m, n);
        
        sc.close();
    }
}
