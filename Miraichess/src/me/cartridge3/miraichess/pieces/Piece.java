
package me.cartridge3.miraichess.pieces;

import me.cartridge3.miraichess.misc.GameColor;
import me.cartridge3.miraichess.misc.Move;

/**
 * @author accs
 *
 */
public abstract class Piece {

	@SuppressWarnings("unused")
	private GameColor gameColor;
	private double PRV; //piece relative value
	private boolean isDead;
	
	
	public Piece(final GameColor gameColor, double PRV) {
		this.gameColor = gameColor;
		this.PRV = PRV;
	}
	
	public GameColor getGameColor() {
		return gameColor;
	}

	public boolean isDead() {
		return isDead;
	}
	
	public void setDead(final boolean dead) {
		this.isDead = dead;
	}
	
	public abstract boolean canMove(Move from);
	
}
