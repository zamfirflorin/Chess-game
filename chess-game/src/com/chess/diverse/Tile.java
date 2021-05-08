package com.chess.diverse;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.image.ImageObserver;
import java.text.AttributedCharacterIterator;

public class Tile {

	public Color color;
	public Rectangle rect;
	
	public Tile(Color color, Rectangle rect) {
		this.color = color;
		this.rect = rect;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}



}
