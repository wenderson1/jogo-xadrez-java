package chess.pieces;

import java.awt.Color;
import boardgame.Board;
import chess.ChessPiece;

public class Rook extends ChessPiece{

	public Rook(Board boards, Color color) {
		super(boards, color);
	}

	@Override
	public String toString() {
		return "R";
	}
}
