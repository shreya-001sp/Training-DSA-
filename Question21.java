public class Question21 {

    // Maximum Product Subarray
    // Input:  nums = [2, 3, -2, 4]
    // Output: 6  (subarray [2, 3])

    public static int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int minProd = nums[0];
        int result  = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = maxProd;
            maxProd = Math.max(nums[i], Math.max(maxProd * nums[i], minProd * nums[i]));
            minProd = Math.min(nums[i], Math.min(temp    * nums[i], minProd * nums[i]));
            result  = Math.max(result, maxProd);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{2, 3, -2, 4}));  // Output: 6
        System.out.println(maxProduct(new int[]{-2, 0, -1}));    // Output: 0
    }
}
