import java.util.Scanner;

public class BooleanExample {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int ticket = 10;
        int age = 45;
        boolean student = false;

        if (age <= 15) {
            System.out.println("Discount 50%");
        } else if (age > 60) {
            System.out.println("Discount 50%");
        } else if (student) {
            System.out.println("Discount 50%");
        } else {
            System.out.println("$10");
        }

        // Shorter version using logical operators (and, or, not)
        if (age <= 15 || age > 60 || student) {
            System.out.println("50% discount");
        } else {
            System.out.println("$10");
        }
    }
}
