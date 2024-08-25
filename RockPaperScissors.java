import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int playerWins = 0;
        int computerWins = 0;

        while (true) {
            System.out.println("Enter your choice (rock/paper/scissors) or 'q' to quit:");
            String playerChoice = input.nextLine().toLowerCase();

            if (playerChoice.equals("q")) {
                break;
            }

            String computerChoice = getComputerChoice(rand);
            System.out.println("Computer chose: " + computerChoice);

 		if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                       (playerChoice.equals("paper") && computerChoice.equals("rock")) ||
                       (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("You win this round!");
                playerWins++;
            } else {
                System.out.println("Computer wins this round!");
                computerWins++;
            }

            System.out.println("Score - You: " + playerWins + ", Computer: " + computerWins);
        }
    }

    public static String getComputerChoice(Random rand) {
        String[] choices = {"rock", "paper", "scissors"};
        return choices[rand.nextInt(choices.length)];
    }
}
