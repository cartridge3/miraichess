package me.cartridge3.miraichess;

import java.util.Scanner;

import me.cartridge3.miraichess.misc.Board;
import me.cartridge3.miraichess.misc.Field;
import me.cartridge3.miraichess.misc.GameHelper;
import me.cartridge3.miraichess.misc.Move;

public class Miraichess {

	public static Board theBoard;
    public static Logger theLogger;
	public static void main(String[] args) {
		
//		Initialize game.
		theLogger = new Logger();
		newGame();
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		String input = sc.nextLine();
		switch(input) {
		case "exit": System.exit(0);
		case "new": newGame();
		default: makeMove(input.split("-")[0],input.split("-")[1]);
		}
	}

	}
	
	public static void makeMove(String stringFrom, String stringTo) {
		Field from = Field.valueOf(stringFrom.toUpperCase());
		Field to = Field.valueOf(stringFrom.toUpperCase());
		
		Move move = new Move(from, to);
		
		
		
		
	}
	
	public static void newGame() {
		
		theBoard = new Board();
		theBoard.clear();
		theBoard.build();
		GameHelper.buildUpPieces();
		
	}

}
