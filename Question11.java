public class Question11 {

    // Spiral Matrix Traversal
    // Input: 5x4 matrix
    // Output: Elements in spiral order

    public static void spiralPrint(int[][] mat, int rows, int cols) {
        int top = 0, bottom = rows - 1, left = 0, right = cols - 1;

        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int i = left; i <= right; i++)
                System.out.print(mat[top][i] + " ");
            top++;

            // Traverse right column
            for (int i = top; i <= bottom; i++)
                System.out.print(mat[i][right] + " ");
            right--;

            // Traverse bottom row
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    System.out.print(mat[bottom][i] + " ");
                bottom--;
            }

            // Traverse left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    System.out.print(mat[i][left] + " ");
                left++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] mat = {
            { 1,  2,  3,  4},
            { 5,  6,  7,  8},
            { 9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20}
        };
        spiralPrint(mat, 5, 4);
        // Output: 1 2 3 4 8 12 16 20 19 18 17 13 9 5 6 7 11 15 14 10
    }
}
