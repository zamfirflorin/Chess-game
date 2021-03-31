package com.chess.diverse;

import java.awt.Color;

public class Tile {

	
	public int col;
	public int row;
	public Color color;
	
	
	public Tile(int x, int y) {
		this.x = x; 
		this.y = y;

	}


	@Override
	public String toString() {
		return "Tile [x=" + x + ", y=" + y + "]";
	}



	
	
}
