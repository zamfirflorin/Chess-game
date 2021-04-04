package com.chess.entities;

import com.chess.pieces.King;
import com.chess.pieces.Knight;

public interface Piece {
	boolean isCaptured = false;
	
	
	void move();

	void capture();
	
	public static Piece getPiece(String pieceName) {
		if(pieceName=="King") { 
			return new King();
		} else if(pieceName == "Knight") {
			return new Knight();
		}
		return null;
	}
}
