package com.escuelait;

public class Mastermind {

	public static void main(String[] args) {
		boolean resume = true;
		GestorIO gestorIO = new GestorIO();		
		Player player = new Player();
		Board board =  new Board();
		String proposalCombination= "";
				
		do {
			board.createSecretCombination();

			int attempt = 0, whites = 0, blacks = 0;
			gestorIO.out("-----MASTERMIND-----");
			for(int i = 0; i<=10; i++) {
				gestorIO.out(attempt + "attempts()s:");
				gestorIO.out("xxxx");	
				
				if(i>0) {
					
					gestorIO.out(board.toString(i));
					
					
					
					gestorIO.out(proposalCombination + " --> " + blacks + " blacks and " + whites + " whites");
				}
				
				boolean isValid; 
				do {
					gestorIO.out("Propose a combination");
					proposalCombination = gestorIO.inString();
					
					isValid = player.createProposalCombination(proposalCombination);
				}while(!isValid);
				
				blacks = board.checkBlacks(proposalCombination);
				whites = board.checkWhites(proposalCombination);	
				
				if(blacks == 4) {
					gestorIO.out("You've won!!! ;-)");
					break;
				}
				
				if(i>10) {
					gestorIO.out("You've lost!!! :-(");
				}
			}			
					
			gestorIO.out("RESUME? (y/n): ");
			if (gestorIO.inChar() != 'y')
				resume = false;				
			
			
		} while (resume);
		
		

	}

}
