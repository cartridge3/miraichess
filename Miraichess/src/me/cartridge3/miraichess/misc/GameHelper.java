package me.cartridge3.miraichess.misc;

import me.cartridge3.miraichess.Miraichess;
import me.cartridge3.miraichess.pieces.Bishop;
import me.cartridge3.miraichess.pieces.King;
import me.cartridge3.miraichess.pieces.Knight;
import me.cartridge3.miraichess.pieces.Pawn;
import me.cartridge3.miraichess.pieces.Piece;
import me.cartridge3.miraichess.pieces.Queen;
import me.cartridge3.miraichess.pieces.Rook;

public class GameHelper {

	public static void buildUpPieces() {
	Miraichess.theBoard.setPiece(new Rook(GameColor.WHITE), Field.A1);
	Miraichess.theBoard.setPiece(new Knight(GameColor.WHITE), Field.B1);
	Miraichess.theBoard.setPiece(new Bishop(GameColor.WHITE), Field.C1);
	Miraichess.theBoard.setPiece(new Queen(GameColor.WHITE), Field.D1);
	Miraichess.theBoard.setPiece(new King(GameColor.WHITE), Field.E1);
	Miraichess.theBoard.setPiece(new Bishop(GameColor.WHITE), Field.F1);
	Miraichess.theBoard.setPiece(new Knight(GameColor.WHITE), Field.G1);
	Miraichess.theBoard.setPiece(new Rook(GameColor.WHITE), Field.H1);
	
	Miraichess.theBoard.setPiece(new Rook(GameColor.BLACK), Field.A8);
	Miraichess.theBoard.setPiece(new Knight(GameColor.BLACK), Field.B8);
	Miraichess.theBoard.setPiece(new Bishop(GameColor.BLACK), Field.C8);
	Miraichess.theBoard.setPiece(new Queen(GameColor.BLACK), Field.D8);
	Miraichess.theBoard.setPiece(new King(GameColor.BLACK), Field.E8);
	Miraichess.theBoard.setPiece(new Bishop(GameColor.BLACK), Field.F8);
	Miraichess.theBoard.setPiece(new Knight(GameColor.BLACK), Field.G8);
	Miraichess.theBoard.setPiece(new Rook(GameColor.BLACK), Field.H8);
	
	Miraichess.theBoard.setPiece(new Pawn(GameColor.WHITE), Field.A2);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.WHITE), Field.B2);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.WHITE), Field.C2);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.WHITE), Field.D2);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.WHITE), Field.E2);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.WHITE), Field.F2);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.WHITE), Field.G2);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.WHITE), Field.H2);
	
	Miraichess.theBoard.setPiece(new Pawn(GameColor.BLACK), Field.A7);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.BLACK), Field.B7);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.BLACK), Field.C7);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.BLACK), Field.D7);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.BLACK), Field.E7);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.BLACK), Field.F7);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.BLACK), Field.G7);
	Miraichess.theBoard.setPiece(new Pawn(GameColor.BLACK), Field.H7);
	
	}
	
	public static Field makeGhostMove(Piece piece, Field field, Direction direction, int times) {
		Field destination = null;
		int[] coordinates = Miraichess.theBoard.getCoordinatesFromField(field);
		int x = coordinates[0];
		int y = coordinates[1];
		
		
		switch(direction) {
		// Straight
		case FORWARD:	 if(piece.getGameColor().equals(GameColor.WHITE)) y += times; else  y-= times; break;  
		case BACKWARD:	 if(piece.getGameColor().equals(GameColor.WHITE)) y -= times; else  y+= times; break;  
		case RIGHT: 	 if(piece.getGameColor().equals(GameColor.WHITE)) x += times; else  x-= times; break;  
		case LEFT:		 if(piece.getGameColor().equals(GameColor.WHITE)) x -= times; else  x+= times; break;
		
		// Diagonal
		case NE:		x = Miraichess.theBoard.getCoordinatesFromField(makeGhostMove(piece,field,Direction.RIGHT,times))[0];
						y = Miraichess.theBoard.getCoordinatesFromField(makeGhostMove(piece,field,Direction.FORWARD,times))[1];	break;			
		case SE:		x = Miraichess.theBoard.getCoordinatesFromField(makeGhostMove(piece,field,Direction.RIGHT,times))[0];
						y = Miraichess.theBoard.getCoordinatesFromField(makeGhostMove(piece,field,Direction.BACKWARD,times))[1]; break;
		case SW:		x = Miraichess.theBoard.getCoordinatesFromField(makeGhostMove(piece,field,Direction.LEFT,times))[0];
						y = Miraichess.theBoard.getCoordinatesFromField(makeGhostMove(piece,field,Direction.BACKWARD,times))[1]; break;		
		case NW:		x = Miraichess.theBoard.getCoordinatesFromField(makeGhostMove(piece,field,Direction.LEFT,times))[0];
						y = Miraichess.theBoard.getCoordinatesFromField(makeGhostMove(piece,field,Direction.FORWARD,times))[1]; break;
		}
		
		
		coordinates[0] = x;
		coordinates[1] = y;
		try {destination = Miraichess.theBoard.getFieldFromCoordinates(coordinates);} catch(IllegalArgumentException ex) {
			coordinates[0] = -1;
			coordinates[1] = -1;
			destination = Miraichess.theBoard.getFieldFromCoordinates(coordinates);
		}
		return destination;
	}
	
	
	
	
	public static Field makeGhostMove(Piece piece, Field field, Direction direction) {return makeGhostMove(piece, field, direction, 1);}

	
}
