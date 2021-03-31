package com.chess.entities;

public interface Piece {
	boolean isCaptured = false;
	
	
	void move();

	void capture();
}
