package com.chess.diverse;

import com.chess.action.Move;
import com.chess.entities.Piece;

public class Position {

	int x; 
	char c; 
	
	public Position(char c,  int x) {
		super();
		this.x = x;
		this.c = c; 
	}

	@Override
	public String toString() {
		return "Position [" +c + " " +  x +"]";
	}
	
	Move move = Move.getMove();	
	Piece blackKnight = Piece.getPiece("Knight");
	
	
}
