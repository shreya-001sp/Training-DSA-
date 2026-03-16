public class Question29 {

    // String Compression (Run-Length Encoding)
    // Input:  "aabbbbeeeeffggg"
    // Output: "a2b4e4f2g3"

    public static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            char c = s.charAt(i);
            int count = 0;
            while (i < s.length() && s.charAt(i) == c) {
                i++;
                count++;
            }
            sb.append(c).append(count);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(compress("aabbbbeeeeffggg"));  // Output: a2b4e4f2g3
    }
}
