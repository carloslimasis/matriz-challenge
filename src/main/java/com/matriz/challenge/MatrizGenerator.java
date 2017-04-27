package com.matriz.challenge;

public final class MatrizGenerator {

	private final int rows;
	private final int columns;
	
	private MatrizGenerator(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
	}
	
	public static final MatrizGenerator matriz(int rows, int columns) {
		return new MatrizGenerator(rows, columns);
	}
	
	public String[][] create() {
		return new String[this.rows][this.columns];
	}
}
