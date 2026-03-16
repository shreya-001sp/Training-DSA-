import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Question25 {

    // Intersection of Two Arrays (unique elements only)
    // Input:  nums1=[4,9,5], nums2=[9,4,9,8,4]
    // Output: [9, 4]

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int x : nums1) set.add(x);

        Set<Integer> result = new HashSet<>();
        for (int x : nums2)
            if (set.contains(x)) result.add(x);

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2})
        ));  // Output: [2]

        System.out.println(Arrays.toString(
            intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})
        ));  // Output: [9, 4]
    }
}
