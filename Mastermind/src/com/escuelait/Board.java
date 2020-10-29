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
	
	public int checkWhites(StringBuffer colors) {
		return secretCombination.checkWhites(colors);
	}
	
	public int checkBlacks(StringBuffer colors) {
		return secretCombination.checkBlacks(colors);
	}
	
	public String toString(int attempt) {
		String result = "";
		for(int j = 0; j<attempt; j++) {
			result += boardCombination[j].toString() + "/n";			
		}
		return result;
	}
	
	public void addResult(Combination line, int attempt) {
		boardCombination[attempt].addResult(line);	
	}
	
}
