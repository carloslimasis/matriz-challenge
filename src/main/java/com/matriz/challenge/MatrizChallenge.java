package com.matriz.challenge;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class MatrizChallenge {

	private final FileReader reader;
	
	private MatrizChallenge(FileReader reader) {
		this.reader = reader;
	}
	
	public static final MatrizChallenge challenge(FileReader reader) {
		return new MatrizChallenge(reader);
	}
	
	public String[][] execute() throws IOException {
		
		final BufferedReader br = new BufferedReader(reader);
		
		String line = br.readLine();
		String[] first_input = line.split(" ");
		
		int rows = parseInt(first_input[0]);
		int columns = parseInt(first_input[1]);
		
		String [][] colors = MatrizGenerator.matriz(rows, columns).create();
		
		line = br.readLine();
		String[] second_input = line.split(" ");
		
		int rowToPut = parseInt(second_input[0]) - 1;
		int columnToPut = parseInt(second_input[1]) - 1;
		String color = second_input[2];
		
		MatrizHelper.matrizHelper(colors).put(rowToPut, columnToPut, color);
		
		return colors;
	}
	
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader(new File("src/main/resources/inputs"));
		String[][] colors = MatrizChallenge.challenge(reader).execute();
		
		for (int row = 0; row < colors.length; row++) {
			for (int column = 0; column < colors[row].length; column++) {
				System.out.println("Row: " + row + " Column: " + column + " = " + colors[row][column]);
			}
		}
	}
}
