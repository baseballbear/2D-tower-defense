package gamedev.entity;

import gamedev.screen.GameScreen;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Level {
	public static int grid[][];
	
	static {
		grid = new int[GameScreen.sizeX][GameScreen.sizeY];
		
		for (int i = 0; i < GameScreen.sizeX; i++) 
			for (int j = 0; j < GameScreen.sizeY; j++) 
				grid[i][j] = -1;
	}
	
	public static void readLevel(String level) {
		
			BufferedReader reader;
			try {
				reader = new BufferedReader(new FileReader("lvl/" +level+".txt"));
				String line = "";
				int j = 0;
				
				while( (line = reader.readLine()) != null && j < GameScreen.sizeY) {
					for (int i = 0; i < line.length(); i++) {
						grid[i][j] = Character.getNumericValue(line.charAt(i));
					}
					j++;
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.err.println("File not found: " + level + ".txt");
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
	}
	
}
