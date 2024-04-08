package randd;
import java.util.Scanner;
public class Program19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows(m): ");
		int m = sc.nextInt();
		System.out.print("Enter the number of columns (n): ");
		int n = sc.nextInt();
		int[][] matrix = new int[m][n];
		System.out.println("Enter the elements of the matrix:");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		int trace = calculateTrace(matrix);
		System.out.println("Trace of the matrix: " + trace);
		System.out.print("Enter the row index (0 to " + (m - 1) + "): ");
		int rowIndex = sc.nextInt();
	    System.out.print("Enter the column index (0 to " + (n - 1) + "): ");
		int colIndex = sc.nextInt();
		int rowSum = calculateRowSum(matrix, rowIndex);
		int colSum = calculateColumnSum(matrix, colIndex);
        System.out.println("Sum of elements in row " + rowIndex + ": " + rowSum);
        System.out.println("Sum of elements in column " + colIndex + ": " + colSum);
        
        sc.close();
    }
    
    // Method to calculate the trace of the matrix
    public static int calculateTrace(int[][] matrix) {
        int trace = 0;
        for (int i = 0; i < matrix.length; i++) {
            trace += matrix[i][i];
        }
        return trace;
    }
    
    // Method to calculate the sum of elements in the i-th row
    public static int calculateRowSum(int[][] matrix, int rowIndex) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[rowIndex][j];
        }
        return sum;
    }
    
    // Method to calculate the sum of elements in the j-th column
    public static int calculateColumnSum(int[][] matrix, int colIndex) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][colIndex];
        }
        return sum;
	}

}
