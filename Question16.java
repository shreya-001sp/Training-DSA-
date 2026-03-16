import java.util.PriorityQueue;

public class Question16 {

    // Kth Largest Element in Array (without sorting)
    // Input:  nums = [3,2,1,5,6,4], k = 2
    // Output: 5

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int num : nums) {
            minHeap.offer(num);
            if (minHeap.size() > k)
                minHeap.poll();
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        System.out.println(findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));     // Output: 5
        System.out.println(findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4)); // Output: 4
    }
}
