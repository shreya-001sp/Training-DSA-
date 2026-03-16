import java.util.Scanner;

public class Question7 {

    // Find Factors of a Number
    // Input: 54
    // Output: 1,2,3,6,9,18,27,54
    // Note: Negative input -> ignore sign, Zero -> "No Factors"

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        n = Math.abs(n);

        if (n == 0) {
            System.out.println("No Factors");
            sc.close();
            return;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (sb.length() > 0) sb.append(",");
                sb.append(i);
            }
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
