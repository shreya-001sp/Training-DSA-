public class Question32 {

    // First Unique Character in a String (return index)
    // Input:  s = "leetcode"
    // Output: 0

    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray())
            count[c - 'a']++;
        for (int i = 0; i < s.length(); i++)
            if (count[s.charAt(i) - 'a'] == 1) return i;
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));     // Output: 0
        System.out.println(firstUniqChar("loveleetcode")); // Output: 2
        System.out.println(firstUniqChar("aabb"));         // Output: -1
    }
}
