public class Question2 {

    // Pythagorean Triplets
    // Input: limit = 20
    // Output: 3 4 5 / 8 6 10 / 5 12 13 / 15 8 17 / 12 16 20

    public static void generateTriplets(int limit) {
        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                double c = Math.sqrt(a * a + b * b);
                if (c == (int) c && (int) c <= limit) {
                    System.out.println(a + " " + b + " " + (int) c);
                }
            }
        }
    }

    public static void main(String[] args) {
        generateTriplets(20);
    }
}
