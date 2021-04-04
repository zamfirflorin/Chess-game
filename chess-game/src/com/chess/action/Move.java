package com.chess.action;

public class Move {
	
	public boolean isLegal;
	public boolean isChecked;
	
	
	
	public Move(boolean isLegal, boolean isChecked) {
		super();
		this.isLegal = isLegal;
		this.isChecked = isChecked;
	}

	


	//static factory method
	public static Move getMove() {
		return new Move(false, false);
	}



	public boolean isLegal() {
		return isLegal;
	}



	public void setLegal(boolean isLegal) {
		this.isLegal = isLegal;
	}



	public boolean isChecked() {
		return isChecked;
	}



	public void setChecked(boolean isChecked) {
		this.isChecked = isChecked;
	}
}
