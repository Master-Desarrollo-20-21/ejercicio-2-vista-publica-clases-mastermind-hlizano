package com.escuelait;

public class Mastermind {

	public static void main(String[] args) {
		boolean resume = true;
		GestorIO gestorIO = new GestorIO();
		Player player = new Player();
		Board board = new Board();
		StringBuffer colors = new StringBuffer("");

		do {
			board.createSecretCombination();

			int blacks = 0, whites = 0;
			gestorIO.out("-----MASTERMIND-----\n");
			for (int attempt = 0; attempt <= 10; attempt++) {
				gestorIO.out(attempt + " attempt(s):\n");
				gestorIO.out("xxxx\n");

				if (attempt > 0) {					
					gestorIO.out(board.toString(attempt));
					
					if (blacks == 4) {
						gestorIO.out("You've won!!! ;-)");
						break;
					}					
				}

				boolean isValid;
				do {
					//clear the Stringbuffer content
					colors.delete(0, colors.length());
					   
					gestorIO.out("Propose a combination: ");
					colors.append(gestorIO.inString().toLowerCase());

					isValid = player.checkProposalCombination(colors);
				} while (!isValid);

				// add combination, blacks and whites results into the board
				blacks = board.checkBlacks(colors);
				whites = board.checkWhites(colors);				
				Combination line = new Combination(colors, blacks, whites);
				board.addResult(line, attempt);

				if (attempt == 10) {
					if (blacks == 4) {
						gestorIO.out("You've won!!! ;-)");						
					}	
					else {
						gestorIO.out("You've lost!!! :-(");
					}					
				}
			}

			gestorIO.out("RESUME? (y/n): ");
			if (gestorIO.inChar() != 'y')
				resume = false;

		} while (resume);

	}

}
