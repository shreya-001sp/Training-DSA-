import java.util.Arrays;

public class Question20 {

    // Rotate Array to the Right by k Steps
    // Input:  nums=[1,2,3,4,5,6,7], k=3
    // Output: [5, 6, 7, 1, 2, 3, 4]

    public static void reverse(int[] a, int l, int r) {
        while (l < r) {
            int t = a[l];
            a[l++] = a[r];
            a[r--] = t;
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));  // Output: [5, 6, 7, 1, 2, 3, 4]
    }
}
