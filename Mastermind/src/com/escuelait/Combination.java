package com.escuelait;

public class Combination {
	private Color[] colors;
	private int whites;
	private int blacks;

	public Combination() {
		colors = new Color[4];
		whites = 0;
		blacks = 0;
	}
	
	@Override
	public String toString() {
		String result = "";
		for(int i = 0; i<4; i++) {
			result += colors[i].toString(); 
		}
		
		return result + " --> " + blacks + " blacks " + " and " + whites + " whites";
	}
	
	public Color getColor(int position) {
		return colors[position];
	}

	public void setColor(int position, Color color) {
		colors[position] = color;
	}

	public void createSecretCombination() {
		for (int i = 0; i < 4; i++) {
			setColor(i, Color.getRandomColor()); // falta validar colores no repetidos
		}
	}

	public void createProposalCombination(Combination colors) {
		for (int i = 0; i < 4; i++) {
			Color color = colors.getColor(i);
			setColor(i, color); 
		}		
	}

	public boolean checkLength(String colors) {
		if(colors.length()!=4)
			return false;
		return true;
	}

	public boolean checkColors(String colors) {
		//	pending!		
		return false;
	}

	public boolean compareCombination(Combination proposedCombination) {

		return false;
	}

	public int checkWhites(Combination proposedCombination) {

		return 0;
	}

	public int checkBlacks(Combination proposedCombination) {

		return 0;
	}

}
