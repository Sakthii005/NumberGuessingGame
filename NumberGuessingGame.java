import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        String continuePlaying="yes";
        System.out.println("Welcome");
        while (continuePlaying.equalsIgnoreCase("yes")) {
            int num=rand.nextInt(1,100);
            int attempts=0;
            int maxAttempts=10;
            System.out.println("\nI've picked a number between 1 to 100. Can you guess the number?");
            System.out.println("You have " + maxAttempts + " attempts");
            while (attempts<maxAttempts) {
                System.out.print("Attempt " +(attempts + 1)+ ": Your guess:");
                int guess=sc.nextInt();
                attempts++;
                if (guess<num) {
                    System.out.println("Too low");
                } else if (guess>num) {
                    System.out.println("Too high");
                } else {
                    System.out.println("Correct! The number was " + num);
                    break;
                }
            }
            if (attempts==maxAttempts) {
                System.out.println("Out of attempts.The number was " + num);
            }
            System.out.print("Play again? (yes/no):");
            continuePlaying=sc.next();
        }
        sc.close();
    }
}
