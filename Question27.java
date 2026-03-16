import java.util.Scanner;

public class Question27 {

    // Month to Season Mapper
    // Mar-May = Spring, Jun-Aug = Summer, Sep-Nov = Autumn, Dec-Feb = Winter
    // Input:  6
    // Output: Season: Summer

    public static String getSeason(int month) {
        if (month < 1 || month > 12) return "Invalid Month Entered";
        if (month >= 3 && month <= 5)  return "Spring";
        if (month >= 6 && month <= 8)  return "Summer";
        if (month >= 9 && month <= 11) return "Autumn";
        return "Winter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month: ");
        int month = sc.nextInt();
        System.out.println("Season: " + getSeason(month));
        sc.close();
    }
}
