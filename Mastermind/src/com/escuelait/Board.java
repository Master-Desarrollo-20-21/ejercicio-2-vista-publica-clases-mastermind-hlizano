package com.escuelait;

public class Board {
	private Combination secretCombination;
	private Combination[] boardCombination;
	
	public Board() {
		secretCombination = new Combination();
		boardCombination = new Combination[11];
	}
	public void createSecretCombination() {
		secretCombination.createSecretCombination();
	}
	
	public int checkWhites(String proposalCombination) {
		Combination combination = new Combination();
		// de alguna forma paso la cadena propuesta a un arreglo de colores
		return secretCombination.checkWhites(combination);
	}
	
	public int checkBlacks(String proposalCombination) {
		Combination combination = new Combination();
		// de alguna forma paso la cadena propuesta a un arreglo de colores
		return secretCombination.checkBlacks(combination);
	}
	
	public String toString(int i) {
		String result = "";
		for(int j = 0; j<i; j++) {
			result += boardCombination[j].toString() + "/n";			
		}
		return boardCombination.toString();
	}
}
