public class Question1 {

    // Check if a Number is Prime
    // Input: Number: 29
    // Output: True

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 29;
        System.out.println(isPrime(num));  // Output: true
    }
}
