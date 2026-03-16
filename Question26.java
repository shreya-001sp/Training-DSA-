public class Question26 {

    // Move All '#' Characters to the Front
    // Input:  "Move#Hash#to#Front"
    // Output: "###MoveHashtoFront"

    public static String moveHash(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '#') count++;
            else sb.append(c);
        }
        return "#".repeat(count) + sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(moveHash("Move#Hash#to#Front"));  // Output: ###MoveHashtoFront
    }
}
