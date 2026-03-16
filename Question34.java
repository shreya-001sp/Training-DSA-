public class Question34 {

    // Palindrome String Check
    // Input:  "madam"
    // Output: true

    public static boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r)
            if (s.charAt(l++) != s.charAt(r--)) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("abba"));  // Output: true
        System.out.println(isPalindrome("abc"));   // Output: false
        System.out.println(isPalindrome("madam")); // Output: true
    }
}
