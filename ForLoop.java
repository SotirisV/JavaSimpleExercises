
import java.util.Scanner;

public class ForLoop {

    public static void main(String[] avgs) {

        System.out.println("Hi!How many stars?");
        Scanner scan = new Scanner(System.in);
        int numStars = scan.nextInt();

        // making for loop // running the program
        for (int i = 0; i < numStars; i++) { // taking on stars
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}