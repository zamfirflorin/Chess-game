package com.chess.diverse;

import java.util.Map;

import com.chess.entities.Piece;

public class Board {

	
	public Tile getTile() {
		return null;
	}
	
	private Board(Builder builder) {
		
	}
	
	//Builder pattern
	public static class Builder{
		Map<Integer, Piece> boardConfig;  
		public Board build() {
			return new Board(this);
		}
	}
	
	
}
