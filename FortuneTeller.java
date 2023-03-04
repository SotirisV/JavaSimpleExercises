import java.util.Random;
import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        // create an array of fortunes
        String[] fortunes = {
                "You will meet your love",
                "Your dreams will come true",
                "Luck is on your side today",
                "Your hard work will pay off in the end",
                "You will find a solution to your problem",
                "A long-lost friend will contact you soon",
                "You will meet someone important today",
                "An exiting adventure is in front of you",
                "You will lose your money",
                "You will receive a gift from your loved one",
                "You will make a new friend today",
                "Your life will change soon"
        };

        // create a scanner object to get user input
        Scanner input = new Scanner(System.in);

        // ask the user for their name
        System.out.print("What is your name? ");
        String name = input.nextLine();

        // generate a random number to select a fortune
        Random random = new Random();
        int index = random.nextInt(fortunes.length);

        // print the fortune 
        System.out.println(name + ", your fortune is: " + fortunes[index]);
    }
}