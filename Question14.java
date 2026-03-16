import java.util.Arrays;

public class Question14 {

    // Matrix Identity Check
    // Input:  Two matrices A and B
    // Output: "Matrices are identical" or "Matrices are not identical"

    public static boolean areIdentical(int[][] A, int[][] B) {
        if (A.length != B.length) return false;
        for (int i = 0; i < A.length; i++)
            if (!Arrays.equals(A[i], B[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        int[][] A = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};
        int[][] B = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}, {4, 4, 4, 4}};

        if (areIdentical(A, B))
            System.out.println("Matrices are identical");
        else
            System.out.println("Matrices are not identical");
    }
}
