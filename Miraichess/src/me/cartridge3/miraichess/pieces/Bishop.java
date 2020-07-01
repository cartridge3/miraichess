package me.cartridge3.miraichess.pieces;

import me.cartridge3.miraichess.misc.GameColor;
import me.cartridge3.miraichess.misc.Move;

public class Bishop extends Piece {

	final static double PRV = 3.0d;
	public Bishop(GameColor gameColor) {
		super(gameColor,PRV);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMove(Move from) {
		// TODO Auto-generated method stub
		return false;
	}

}
