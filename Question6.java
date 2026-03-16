import java.util.Scanner;
import java.util.Arrays;

public class Question6 {

    // Minimum Discount Product
    // Input: item name, price, discount percentage
    // Output: Item(s) with minimum discount amount

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        String[] names = new String[n];
        int[] discounts = new int[n];

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(",");
            names[i] = parts[0];
            int price = Integer.parseInt(parts[1]);
            int pct   = Integer.parseInt(parts[2]);
            discounts[i] = (price * pct) / 100;
        }

        int min = Arrays.stream(discounts).min().getAsInt();

        for (int i = 0; i < n; i++) {
            if (discounts[i] == min)
                System.out.println(names[i]);
        }
        sc.close();
    }
}
