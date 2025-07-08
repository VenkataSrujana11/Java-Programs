import java.util.Scanner;

public class practice2{
    
    public static int[][] ReplaceDiagonal(int[][] mat, int m) {
        // Create a result matrix to store the updated values
        int[][] result = new int[m][m];

        // Iterate through each element of the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                // Copy all non-diagonal elements as is
                if (i != j) {
                    result[i][j] = mat[i][j];
                } else {
                    // For diagonal elements, sum adjacent elements (top, bottom, left, right)
                    int sum = 0;
                    if (i - 1 >= 0) sum += mat[i - 1][j];  // Top
                    if (i + 1 < m) sum += mat[i + 1][j];   // Bottom
                    if (j - 1 >= 0) sum += mat[i][j - 1];  // Left
                    if (j + 1 < m) sum += mat[i][j + 1];   // Right
                    
                    // Assign sum to diagonal position
                    result[i][i] = sum;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Size of the matrix
        int m = 3;
        int[][] mat = new int[m][m];

        // Input the matrix
        System.out.println("Enter the 3x3 matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Process the matrix to replace diagonal elements
        int[][] updated = ReplaceDiagonal(mat, m);

        // Output the updated matrix
        System.out.println("Updated matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(updated[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
