public class Question37 {

    // String Rotation Check
    // Input:  s="abcde", goal="cdeab"
    // Output: true

    public static boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab")); // Output: true
        System.out.println(rotateString("abcde", "abced")); // Output: false
    }
}
