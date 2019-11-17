package chess;

import java.awt.Color;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece {
	
	private Color color;

	public ChessPiece(Board boards, Color color) {
		super(boards);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	
	
}
