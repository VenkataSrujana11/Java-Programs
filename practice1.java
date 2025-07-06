public class practice1 {
    public static int[][] ReplaceDiagonal(int[][] mat, int m) {
        // Return unchanged if matrix is empty
        if (mat == null || mat.length == 0) return mat;

        // Clone the matrix to avoid modifying elements used in further calculations
        int[][] result = new int[m][m];
        
        // Deep copy the matrix to result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                result[i][j] = mat[i][j];
            }
        }

        for (int i = 0; i < m; i++) {
            // Only update diagonal elements (i == j)
            int sum = 0;

            // Sum adjacent elements (top, bottom, left, right)
            if (i - 1 >= 0) sum += mat[i - 1][i];  // Top
            if (i + 1 < m) sum += mat[i + 1][i];   // Bottom
            if (i - 1 >= 0) sum += mat[i][i - 1];  // Left
            if (i + 1 < m) sum += mat[i][i + 1];   // Right

            // Set the diagonal value to the sum of adjacent elements
            result[i][i] = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int m = sc.nextInt();
        int[][] mat = new int[m][m];

        // Input the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        // Replace diagonal elements with sum of adjacent non-diagonal elements
        int[][] updated = ReplaceDiagonal(mat, m);

        // Print the updated matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(updated[i][j] + " ");  // Print matrix elements
            }
            System.out.println();
        }

        sc.close();
    }
}
