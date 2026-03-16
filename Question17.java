public class Question17 {

    // Missing Number in range [0, n]
    // Input:  nums = [3, 0, 1]
    // Output: 2

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int x : nums) actual += x;
        return expected - actual;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{3, 0, 1}));            // Output: 2
        System.out.println(missingNumber(new int[]{0, 1}));               // Output: 2
        System.out.println(missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1})); // Output: 8
    }
}
