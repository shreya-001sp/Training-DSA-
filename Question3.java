import java.util.Scanner;

public class Question3 {

    // Maximum Marks Per Semester
    // Input: 3 semesters, marks between 0-100
    // Output: Maximum mark in each semester

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of semester: ");
        int semesters = sc.nextInt();
        int[] subjects = new int[semesters];

        for (int i = 0; i < semesters; i++) {
            System.out.print("Enter no of subjects in " + (i + 1) + " semester: ");
            subjects[i] = sc.nextInt();
        }

        for (int i = 0; i < semesters; i++) {
            System.out.print("Marks obtained in semester " + (i + 1) + ": ");
            int max = Integer.MIN_VALUE;
            boolean valid = true;
            for (int j = 0; j < subjects[i]; j++) {
                int mark = sc.nextInt();
                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    valid = false;
                    break;
                }
                max = Math.max(max, mark);
            }
            if (valid)
                System.out.println("Maximum mark in " + (i + 1) + " semester: " + max);
        }
        sc.close();
    }
}
