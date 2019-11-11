package boardgame;

public class Piece {
	
	protected Position position;
	private Board boards;
	
	public Piece(Board boards) {
		
		this.boards = boards;
		position = null;
	}
	
	protected Board getBoards() {
		return boards;
	}

	

	
	
	
	
	

}
