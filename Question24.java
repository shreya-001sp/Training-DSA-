public class Question24 {

    // Majority Element (appears more than n/2 times)
    // Input:  nums = [2, 2, 1, 1, 1, 2, 2]
    // Output: 2

    public static int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));            // Output: 3
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2})); // Output: 2
    }
}
