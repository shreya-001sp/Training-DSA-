public class Question31 {

    // Check Valid Anagram
    // Input:  s = "anagram", t = "nagaram"
    // Output: true

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];
        for (char c : s.toCharArray()) count[c - 'a']++;
        for (char c : t.toCharArray()) count[c - 'a']--;

        for (int x : count)
            if (x != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // Output: true
        System.out.println(isAnagram("rat",     "car"));     // Output: false
        System.out.println(isAnagram("listen",  "silent"));  // Output: true
    }
}
