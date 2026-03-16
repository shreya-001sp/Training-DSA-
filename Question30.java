public class Question30 {

    // Reverse a String
    // Input:  "Capgemini"
    // Output: "inimegpaC"

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("GLA"));       // Output: ALG
        System.out.println(reverse("for"));       // Output: rof
        System.out.println(reverse("Capgemini")); // Output: inimegpaC
    }
}
