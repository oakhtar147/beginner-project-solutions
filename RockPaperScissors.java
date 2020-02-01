import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		boolean playAgain = true;

		int userWins = 0;
		int compWins = 0;
		int draw = 0;

		while (playAgain) {

			String[] compChoices = { "rock", "paper", "scissors" };
			Random r = new Random();
			int index = r.nextInt(compChoices.length);
			String compChoice = compChoices[index];

			// System.out.println(compChoices[compChoice]);

			System.out.print("Select one: rock/paper/scissors ");
			String userChoice = input.next().toLowerCase();

			if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {

				if (userChoice.equals("rock") && compChoice.equals("rock")) {
					draw++;
					System.out.println("The game drew");

				}

				else if (userChoice.equals("rock") && compChoice.equals("paper")) {
					compWins++;
					System.out.println("The computer won! :(");

				}

				else if (userChoice.equals("rock") && compChoice.equals("scissors")) {
					userWins++;
					System.out.println("You won! :)");

				}

				else if (userChoice.equals("paper") && compChoice.equals("paper")) {
					draw++;
					System.out.println("The game drew");

				}

				else if (userChoice.equals("paper") && compChoice.equals("rock")) {
					userWins++;
					System.out.println("You won! :)");

				}

				else if (userChoice.equals("paper") && compChoice.equals("scissors")) {
					compWins++;
					System.out.println("The computer won! :(");

				}

				else if (userChoice.equals("scissors") && compChoice.equals("paper")) {
					userWins++;
					System.out.println("You won! :)");

				}

				else if (userChoice.equals("scissors") && compChoice.equals("scissors")) {
					draw++;
					System.out.println("The game drew");

				}

				else if (userChoice.equals("scissors") && compChoice.equals("rock")) {
					compWins++;
					System.out.println("The computer won! :(");

				}

				else {
					System.out.println("Please put valid input!");
					// break;

				}

				System.out.println("Would you like to play again? (y/n)");
				char ans = input.next().charAt(0); // should work even if yes/no

				if (ans == 'n') {
					playAgain = false;
				}

			}

		}

		System.out.printf("The user won %s times\n" + "The computer won %s times\n" + "Draws: %s", userWins, compWins,
				draw);

	}

}
