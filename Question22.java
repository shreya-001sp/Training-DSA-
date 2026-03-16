import java.util.HashMap;
import java.util.Map;

public class Question22 {

    // Count Pairs with Given Sum
    // Input:  arr=[1,5,7,-1,5], target=6
    // Output: 3

    public static int countPairs(int[] arr, int target) {
        Map<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        for (int x : arr) {
            count += freq.getOrDefault(target - x, 0);
            freq.put(x, freq.getOrDefault(x, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{1, 5, 7, -1, 5}, 6));  // Output: 3
        System.out.println(countPairs(new int[]{1, 1, 1, 1}, 2));      // Output: 6
        System.out.println(countPairs(new int[]{10, 12, 10, 15, -1}, 125)); // Output: 0
    }
}
