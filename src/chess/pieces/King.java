package chess.pieces;

import java.awt.Color;

import boardgame.Board;
import chess.ChessPiece;

public class King extends ChessPiece {

	public King(Board boards, Color color) {
		super(boards, color);

	}
	
	@Override
	public String toString() {
		return "K";
	}

}
