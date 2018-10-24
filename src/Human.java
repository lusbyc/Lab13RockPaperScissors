import java.util.Scanner;

public class Human extends Player {

	private Scanner scnr;

	@Override
	public Roshambo generateRoshambo() {
		scnr = new Scanner(System.in);
		String userInput = Validator.getString(scnr, "Rock, paper, or scissors? (R/P/S) ");

		if (userInput.equalsIgnoreCase("R")) {
			return Roshambo.ROCK;
		} else if (userInput.equalsIgnoreCase("P")) {
			return Roshambo.PAPER;
		} else if (userInput.equalsIgnoreCase("S")) {
			return Roshambo.SCISSORS;
		} else {
			return null;
		}

	}

}
