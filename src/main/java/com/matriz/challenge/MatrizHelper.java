package com.matriz.challenge;

public final class MatrizHelper {

	private final String[][] matriz;

	private MatrizHelper(String[][] matriz) {
		this.matriz = matriz;
	}

	public static final MatrizHelper matrizHelper(String[][] matriz) {
		return new MatrizHelper(matriz);
	}
	
	public MatrizHelper put(int row, int column, String color) {
		this.matriz[row][column] = color;
		return this;
	}
	
	public String[][] matriz() {
		return this.matriz;
	}
}
