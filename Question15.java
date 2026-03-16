import java.util.Arrays;

public class Question15 {

    // Reverse an Array
    // Input:  {5, 4, 3, 2, 1}
    // Output: {1, 2, 3, 4, 5}

    public static void reverse(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        reverse(arr);
        System.out.println(Arrays.toString(arr));  // Output: [1, 2, 3, 4, 5]
    }
}
