import java.util.Scanner;

public class MatrixOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== 1st Year Matrix Calculator ===");
        System.out.print("Enter the number of rows for the matrices: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns for the matrices: ");
        int cols = scanner.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];

        System.out.println("\n--- Populate Matrix A ---");
        fillMatrix(matrixA, scanner);

        System.out.println("\n--- Populate Matrix B ---");
        fillMatrix(matrixB, scanner);

        System.out.println("\n[Matrix A]:");
        printMatrix(matrixA);

        System.out.println("\n[Matrix B]:");
        printMatrix(matrixB);

        // Matrix Addition
        int[][] sumResult = addMatrices(matrixA, matrixB);
        System.out.println("\n[Addition Result (A + B)]:");
        printMatrix(sumResult);

        // Matrix Transpose
        int[][] transposeA = transposeMatrix(matrixA);
        System.out.println("\n[Transpose of Matrix A (A^T)]:");
        printMatrix(transposeA);

        scanner.close();
    }

    // Helper method to populate the matrix from user input
    public static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Helper method to cleanly print the matrix to the console
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] a, int[][] b) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to calculate the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows]; // Rows and columns swap dimensions

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
