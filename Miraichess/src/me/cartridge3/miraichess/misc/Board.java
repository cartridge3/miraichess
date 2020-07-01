package me.cartridge3.miraichess.misc;

import me.cartridge3.miraichess.pieces.Piece;

public class Board {

	private Piece[][] boardMatrix;
	
	public Board() {}
	
	public void build() {
		if(boardMatrix == null) {
			boardMatrix = new Piece[8][8];
		} else throw new IllegalStateException();
	}
	
	public void clear() {
		boardMatrix = null;
	}
	
	public Field getFieldFromCoordinates(int[] coordinates) {
		
		int x = coordinates[0];
		int y = coordinates[1];
		StringBuilder sb = new StringBuilder();
		switch(x) {
		case  0: sb.append("A"); break;
		case  1: sb.append("B"); break;
		case  2: sb.append("C"); break;
		case  3: sb.append("D"); break;
		case  4: sb.append("E"); break;
		case  5: sb.append("F"); break;
		case  6: sb.append("G"); break;
		case  7: sb.append("H"); break;
		}
	
		sb.append(y + 1);
		
		return Field.valueOf(sb.toString());
	}
	
	public int[] getCoordinatesFromField(Field field) {
		int x = -1;
		int y = -1;
		
		char c = field.toString().charAt(0);
		
		switch(c) {
		case 'A': x=0; break;
		case 'B': x=1; break;
		case 'C': x=2; break;
		case 'D': x=3; break;
		case 'E': x=4; break;
		case 'F': x=5; break;
		case 'G': x=6; break;
		case 'H': x=7; break;
		}
	
		y = Integer.parseInt(Character.toString(field.toString().charAt(1))) - 1;
		int[] coordinates = new int[2];
		
		if(x==-1 || (y<0 || y>7)) {
			throw new IllegalArgumentException();
		}
		coordinates[0] = x;
		coordinates[1] = y;
		
		return coordinates;
		
	}
	
	public void setPiece(Piece piece, Field field) {
		int[] coordinates = getCoordinatesFromField(field);
		int x = coordinates[0];
		int y = coordinates[1];
		this.boardMatrix[x][y] = piece;
	}
	
	public void setPiece(int x, int y, Piece piece) {
		this.boardMatrix[x][y] = piece;
	}
	
	public Piece getPiece(Field field) {
		int[] coordinates = getCoordinatesFromField(field);
		int x = coordinates[0];
		int y = coordinates[1];
		return this.boardMatrix[x][y];
	}
	
	public Piece getPiece(int x, int y) {
		return this.boardMatrix[x][y];
	}
	
	
}
