import java.util.Scanner;

public class SwitchStatment {

    public static void main(String[] avgs) {

        Scanner a = new Scanner(System.in);

        int password;
        // write password 3 digits
        password = a.nextInt();
        String coffeType = null;

        // Using if statement
        if (password == 525) {
            System.out.println("Black Coffe");
        } else if (password == 323) {
            System.out.println("Caputcino");
        } else if (password == 121) {
            System.out.println("Esspresso");
        } else {
            System.out.println("Unnkown");
        }

        // Χρησιμοποιώντας switch statement

        switch (password) {
            case 525:
                coffeType = "Black Coffe";
                break;
            case 323:
                coffeType = "Caputcino";
                break;
            case 121:
                coffeType = "Essperesso";
                break;
        }

    }

}