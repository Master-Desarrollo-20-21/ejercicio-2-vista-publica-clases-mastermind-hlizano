package com.escuelait;

public class Combination {
	private StringBuffer colors;
	private int whites;
	private int blacks;

	public Combination() {
		colors = new StringBuffer("");
		whites = 0;
		blacks = 0;
	}
	
	public Combination(StringBuffer colors, int blacks, int whites) {
		this.colors = colors;
		this.blacks = blacks;
		this.whites = whites;
	}
	
	@Override
	public String toString() {
		return colors + " --> " + blacks + " blacks " + " and " + whites + " whites";
	}

	public void createSecretCombination() {
		for (int i = 0; i < 4; i++) {
			colors.append(Color.getRandomColor());
		}
	}

	public boolean checkLength(StringBuffer colors) {
		if(colors.length()!=4)
			return false;
		return true;
	}

	public boolean isValidColors(StringBuffer colors) {				
		for(int i = 0; i< colors.length(); i++) {
			String color = String.valueOf(colors.charAt(i));
			
			try {
				Color exist = Color.valueOf(color);
			}
			catch(Exception e) {
				return false;
			}
		}		
		return true;
	}

	public int checkWhites(StringBuffer colors) {
		//  pending!
		return 0;
	}

	public int checkBlacks(StringBuffer colors) {
		//	pending!
		return 0;
	}
	
	public void addResult(Combination line) {
		this.colors = line.colors;
		this.blacks = line.blacks;
		this.whites = line.whites;
	}

}
