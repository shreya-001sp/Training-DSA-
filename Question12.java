import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Question12 {

    // Second Smallest and Second Largest in Array
    // Input:  [1, 2, 4, 7, 7, 5]
    // Output: Second Smallest: 2, Second Largest: 5

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};

        TreeSet<Integer> set = new TreeSet<>();
        for (int x : arr) set.add(x);

        List<Integer> unique = new ArrayList<>(set);
        int size = unique.size();

        System.out.println("Second Smallest : " + (size >= 2 ? unique.get(1) : -1));
        System.out.println("Second Largest : "  + (size >= 2 ? unique.get(size - 2) : -1));
    }
}
