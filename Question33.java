public class Question33 {

    // First Non-Repeated Character in a String
    // Input:  "swiss"
    // Output: w

    public static char firstNonRepeated(String s) {
        int[] freq = new int[256];
        for (char c : s.toCharArray()) freq[c]++;
        for (char c : s.toCharArray())
            if (freq[c] == 1) return c;
        return '\0';
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeated("swiss")); // Output: w
    }
}
