import java.util.Scanner;

public class Question5 {

    // Total Tyres in Dealerships
    // Cars have 4 tyres, Bikes have 2 tyres
    // Input: 3 dealerships with (cars, bikes)
    // Output: Total tyres in each dealership

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of dealerships: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int cars = sc.nextInt();
            int bikes = sc.nextInt();
            int tyres = (cars * 4) + (bikes * 2);
            System.out.println(tyres);
        }
        sc.close();
    }
}
