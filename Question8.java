public class Question8 {

    // Matrix Rotation by 90 Degrees Clockwise
    // Input:  [[1,2,3],[4,5,6],[7,8,9]]
    // Output: [[7,4,1],[8,5,2],[9,6,3]]

    public static void rotate(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            int l = 0, r = n - 1;
            while (l < r) {
                int temp = matrix[i][l];
                matrix[i][l++] = matrix[i][r];
                matrix[i][r--] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate(matrix);

        System.out.println("Rotated Matrix:");
        for (int[] row : matrix) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
        // Output:
        // 7 4 1
        // 8 5 2
        // 9 6 3
    }
}
