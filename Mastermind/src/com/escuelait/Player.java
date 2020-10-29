package com.escuelait;

public class Player {
	private Combination proposalCombination;
	private GestorIO gestorIO;
	
	public Player() {
		proposalCombination = new Combination();
		gestorIO = new GestorIO();
	}
	
	public boolean createProposalCombination(String proposalCombination) {
		if(!this.proposalCombination.checkLength(proposalCombination)) {
			gestorIO.out("Wrong proposed combination length");
			return false;
		}
		
		if(!this.proposalCombination.checkColors(proposalCombination)) {
			gestorIO.out("Wrong colors, they must be: rbygop");
			return false;
		}
		
		if(!this.proposalCombination.checkRepeatedColors(proposalCombination)) {
			gestorIO.out("Can't repeat colors");
			return false;
		}		
		
		// ***falta*** de alguna forma paso la cadena propuesta a un arreglo de colores :(
		this.proposalCombination.createProposalCombination(this.proposalCombination);
		
		return true;		
		
	}
}
