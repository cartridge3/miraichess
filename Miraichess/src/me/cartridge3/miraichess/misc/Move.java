package me.cartridge3.miraichess.misc;

import me.cartridge3.miraichess.Miraichess;
import me.cartridge3.miraichess.pieces.Piece;

public class Move {

	private Field from;
	private Field to;
	
	private Piece fromPiece;
	private Piece toPiece;
	
	public Move(final Field from, final Field to) {
		this.from = from;
		this.to = to;
		this.fromPiece = Miraichess.theBoard.getPiece(from);
		this.toPiece = Miraichess.theBoard.getPiece(to);
	}
	
	public Field getFrom() {
		return from;
	}

	public Field getTo() {
		return to;
	}

	public Piece getFromPiece() {
		return fromPiece;
	}

	public Piece getToPiece() {
		return toPiece;
	}
}
