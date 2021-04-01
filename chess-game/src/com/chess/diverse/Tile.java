package com.chess.diverse;

import java.awt.Color;

public class Tile {

	
	public int row;
	public int col;
	public Color color;
	
	
	public Tile(int row, int col, Color color) {
		this.row = row; 
		this.col = col;
		this.color = color;
	}


	@Override
	public String toString() {
		return "Tile [row=" + row + ", col=" + col + ", color=" + color + "]";
	}






	
	
}
