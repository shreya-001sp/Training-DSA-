import java.util.LinkedHashMap;
import java.util.Map;

public class Question10 {

    // Count Occurrences of Each Element
    // Input:  1 2 3 3 4 1 4 5 1 2
    // Output: 1 occurs 3 times, 2 occurs 2 times, etc.

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 4, 1, 4, 5, 1, 2};

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int x : arr)
            map.put(x, map.getOrDefault(x, 0) + 1);

        for (Map.Entry<Integer, Integer> e : map.entrySet())
            System.out.println(e.getKey() + " occurs " + e.getValue() + " times");
    }
}
