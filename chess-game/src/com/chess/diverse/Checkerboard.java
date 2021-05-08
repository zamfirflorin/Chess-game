package com.chess.diverse;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel; 

public class Checkerboard extends JPanel implements ActionListener{
	
	public List<Tile> tiles = new ArrayList<>();
	public List<Position> positions = new ArrayList<>();
	
	public Tile[][] tilesArray = new Tile[8][8];
	
    public void paint(Graphics g) {
        
        int row;   // Row number, from 0 to 7
        int col;   // Column number, from 0 to 7
        int x,y;   // Top-left corner of square/tile
        char c;
        for ( row = 0, c = 'A';  row < 8;  ++c, row++ ) {
        
           for ( col = 0;  col < 8;  col++) {
              x = col * 50;
              y = row * 50;
              if ( (row % 2) == (col % 2) ) {
            	  tilesArray[row][col] = new Tile(new Color(227,193,111), new Rectangle(row, col, x, y) );
              }
              else {
            	  tilesArray[row][col] = new Tile(new Color(184,139,74), new Rectangle(row, col, x, y) );
              }

              g.fillRect(x, y, row, col);
              //tiles.add(new Tile(x, y));
              positions.add(new Position(c, col));
           } 
           
          
        } // end for row
        System.out.println(tiles);
        System.out.println(positions);
     }  // end paint()

 /*   public void drawFrame(Graphics g, int frameNumber, int width, int height) {

        int row;   // Row number, from 0 to 7
        int col;   // Column number, from 0 to 7
        int x,y;   // Top-left corner of square

        for ( row = 0;  row < 8;  row++ ) {

           for ( col = 0;  col < 8;  col++) {
              x = col * 50;
              y = row * 50;
              if ( (row % 2) == (col % 2) )
                 g.setColor(Color.MAGENTA);
              else
                 g.setColor(Color.BLUE);
              g.fillRect(x, y, 100, 100);

           } 

        }
    }
    */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}