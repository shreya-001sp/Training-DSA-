import java.util.Arrays;

public class Question23 {

    // Move All Zeros to End (In-Place)
    // Input:  [0, 1, 0, 3, 12]
    // Output: [1, 3, 12, 0, 0]

    public static void moveZeroes(int[] nums) {
        int pos = 0;
        for (int x : nums)
            if (x != 0) nums[pos++] = x;
        while (pos < nums.length)
            nums[pos++] = 0;
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));  // Output: [1, 3, 12, 0, 0]
    }
}
