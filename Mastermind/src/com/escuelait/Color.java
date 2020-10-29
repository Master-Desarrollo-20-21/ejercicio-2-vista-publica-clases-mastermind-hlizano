package com.escuelait;

import java.util.Random;

public enum Color {
	R("RED"),
	Y("YELLOW"),
	G("GREEN"),
	O("ORANGE"),
	B("BLACK"),
	P("PINK");	
	
	private final String label;
	
	private Color(String label) {
		this.label = label;
	}

	public static Color getRandomColor() {
		Random random = new Random();
		return values()[random.nextInt(values().length)];
	}
	
	@Override
	public String toString() {
		return this.label;
	}
}