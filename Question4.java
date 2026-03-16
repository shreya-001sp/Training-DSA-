import java.util.Scanner;

public class Question4 {

    // Algebraic Equation: a³ + a²b + 2a²b + 2ab² + ab² + b³
    // Simplifies to: (a + b)³
    // Input: a = 2, b = 3
    // Output: 125

    public static long solve(long a, long b) {
        // a³ + a²b + 2a²b + 2ab² + ab² + b³
        // = a³ + 3a²b + 3ab² + b³
        // = (a + b)³
        return (long) Math.pow(a + b, 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        long a = sc.nextLong();
        System.out.print("Enter value of b: ");
        long b = sc.nextLong();
        System.out.println("Result: " + solve(a, b));
        sc.close();
    }
}
