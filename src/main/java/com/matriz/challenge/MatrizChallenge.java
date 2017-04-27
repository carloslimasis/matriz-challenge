package com.matriz.challenge;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
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
		String[] first_entry = line.split(" ");
		
		int rows = parseInt(first_entry[0]);
		int columns = parseInt(first_entry[1]);
		
		String [][] colors = MatrizGenerator.matriz(rows, columns).create();
		
		line = br.readLine();
		String[] second_entry = line.split(" ");
		
		int rowToPut = parseInt(second_entry[0]) - 1;
		int columnToPut = parseInt(second_entry[1]) - 1;
		String color = second_entry[2];
		
		MatrizHelper.matrizHelper(colors).put(rowToPut, columnToPut, color);
		
		return colors;
	}
}
