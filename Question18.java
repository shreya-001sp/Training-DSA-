public class Question18 {

    // Find Duplicate Number (Floyd's Cycle Detection)
    // Input:  arr = [1, 3, 4, 2, 2]
    // Output: 2

    public static int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Detect cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find entry point of cycle
        fast = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1, 3, 4, 2, 2})); // Output: 2
        System.out.println(findDuplicate(new int[]{3, 1, 3, 4, 2})); // Output: 3
    }
}
