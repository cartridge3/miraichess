package me.cartridge3.miraichess.pieces;

import me.cartridge3.miraichess.misc.GameColor;
import me.cartridge3.miraichess.misc.Move;

public class Rook extends Piece {

	final static double PRV = 5.0d;
	public Rook(GameColor gameColor) {
		super(gameColor,PRV);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMove(Move from) {
		// TODO Auto-generated method stub
		return false;
	}

}
