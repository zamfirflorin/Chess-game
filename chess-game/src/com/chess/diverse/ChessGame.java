package com.chess.diverse;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.Timer;


public class ChessGame {

	public static void main(String[] args) {
		
	      JFrame window = new JFrame("Checkerboard");
	      Checkerboard drawingArea = new Checkerboard();
	      drawingArea.setBackground(Color.WHITE);
	      window.setContentPane(drawingArea);
	      drawingArea.setPreferredSize(new Dimension(400,400));
	      window.pack();
	      window.setLocation(100,50);
	      window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      window.setResizable(false); // The user can't change the size.
	      Timer frameTimer = new Timer(20, drawingArea);
	      window.setVisible(true);
	      //frameTimer.start(); // commented out so we don't get an animation

	   } // end main


	   
}

	