import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// Declare/initialize variables.
		Scanner scan = new Scanner(System.in);
		Player user = new Human();
		Player opponent;
		Roshambo userValue;
		Roshambo opponentValue;
		String userName;
		Roshambo opponentChoice = null;
		String cont = "y";
		
		
		// Prompt user to enter name. Validate input.
		userName = Validator.getString(scan, "Please enter your name: ");
		user.setName(userName); 
		
		// Prompt user to select opponent. Validate input.
		while (cont.equalsIgnoreCase("y")) {
			String userChoice = Validator.getString(scan, "Would you like to play against The Dogs or The Cats? (D/C)? ");
			if(userChoice.equalsIgnoreCase("D")) {
				opponent = new Dummy();
				opponentChoice = opponent.generateRoshambo();
			}
			else if (userChoice.equalsIgnoreCase("C")) {
				opponent = new Brainy();
				opponentChoice = opponent.generateRoshambo();
			}
		
			// Prompt user to select rock, paper, or scissors. Validate input.
			String invalidInput = "y";
			while (invalidInput.equalsIgnoreCase("y")) {
				String userPlay = Validator.getString(scan, "Rock, paper, or scissors? (R/P/S): ");
				if(userPlay.equalsIgnoreCase("R")) {
					user.setValue(Roshambo.ROCK);
					invalidInput = "n";
				}
				else if(userPlay.equalsIgnoreCase("P")) {
					user.setValue(Roshambo.PAPER);
					invalidInput = "n";
				}
				else if(userPlay.equalsIgnoreCase("S")) {
					user.setValue(Roshambo.SCISSORS);
					invalidInput = "n";
				}
			
				else {
					System.out.println("Not a valid input");
				}
			}
			// Display opponent's choice.
			System.out.println("Opponent's Choice: " + opponentChoice.toString());
		
			// Display user's choice.
			System.out.println("Player's Choice: " + user.getValue());
			// Display results of match. Write a separate method.
			
			
			
			
			
			
			
			
			
			
		
			// Prompt user to continue. Validate input. 
			cont = Validator.getString(scan, "Play again? ");
			
		
		}		
	}

}
