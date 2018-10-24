
public class Brainy extends Player {

	@Override
	public Roshambo generateRoshambo() {
		// int randNum = (int) Math.random(); // generates a random number between 0 and
		// 1
		int randNum = (int) Math.random() * 3; // generates a random number between 0 and 2

		switch (randNum) {
		case 1:
			return Roshambo.ROCK; 	// we don't need a break because of the return. 
									// if it was a void method then
									// we'd need a break.
		case 2:
			return Roshambo.PAPER;
		case 3:
			return Roshambo.SCISSORS;
		default:
			return null;
		}

	}

}
