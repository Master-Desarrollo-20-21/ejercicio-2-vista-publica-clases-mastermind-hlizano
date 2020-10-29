package com.escuelait;

public class Player {
	private Combination proposalCombination;
	private GestorIO gestorIO;

	public Player() {
		proposalCombination = new Combination();
		gestorIO = new GestorIO();
	}

	public boolean checkProposalCombination(StringBuffer colors) {
		if (!this.proposalCombination.checkLength(colors)) {
			gestorIO.out("Wrong proposed combination length\n");
			return false;
		}

		if (!this.proposalCombination.isValidColors(colors)) {
			gestorIO.out("Wrong colors, they must be: rbygop\n");
			return false;
		}

		return true;
	}
}
