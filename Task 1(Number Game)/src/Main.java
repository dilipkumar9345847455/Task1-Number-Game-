import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalAttempts = 0;
        int win = 0;

        while (true) {
            System.out.println("Enter the maximum number:");
            int max = sc.nextInt();
            System.out.println("Enter the minimum number:");
            int min = sc.nextInt();
            sc.nextLine();

            int targetNumber = (int) (Math.random() * (max - min + 1) + min);
            int attempts = 0;1

            while (true) {
                System.out.println("Guess a number between " + min + " and " + max + ":");
                int guess = sc.nextInt();
                attempts++;

                if (guess > targetNumber) {
                    System.out.println("It's greater.");
                } else if (guess < targetNumber) {
                    System.out.println("It's lower.");
                } else {
                    System.out.println("Correct guess!");
                    win++;
                    break;
                }
            }

            totalAttempts += attempts;
            System.out.println("Attempts: " + attempts);
            System.out.println("Wins: " + win);

            double winRate = (double) win / totalAttempts * 100;
            System.out.printf("Your win rate is %.2f%%\n", winRate);

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = sc.next();
            if (!playAgain.equalsIgnoreCase("yes")) {
                sc.close();
                System.exit(0);
            }
            sc.nextLine();
        }
    }
}
