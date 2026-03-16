import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question13 {

    // Merge Overlapping Intervals
    // Input:  [[1,3],[2,6],[8,10],[15,18]]
    // Output: [[1,6],[8,10],[15,18]]

    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        int[] curr = intervals[0];

        for (int[] iv : intervals) {
            if (iv[0] <= curr[1])
                curr[1] = Math.max(curr[1], iv[1]);
            else {
                result.add(curr);
                curr = iv;
            }
        }
        result.add(curr);
        return result.toArray(new int[0][]);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] merged = merge(intervals);

        for (int[] r : merged)
            System.out.println(Arrays.toString(r));
        // Output:
        // [1, 6]
        // [8, 10]
        // [15, 18]
    }
}
