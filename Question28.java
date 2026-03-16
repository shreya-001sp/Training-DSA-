public class Question28 {

    // Counting Valleys in a Hiking Path
    // U = step up, D = step down
    // Input:  "UDDDUDUU"
    // Output: 1

    public static int countValleys(String path) {
        int level = 0;
        int valleys = 0;

        for (char c : path.toCharArray()) {
            if (c == 'U') level++;
            else          level--;

            // A valley ends when level returns to 0 after going below
            if (c == 'U' && level == 0)
                valleys++;
        }
        return valleys;
    }

    public static void main(String[] args) {
        System.out.println(countValleys("UDDDUDUU"));  // Output: 1
    }
}
