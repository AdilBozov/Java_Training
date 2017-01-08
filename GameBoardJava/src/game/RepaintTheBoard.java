package game;


class RepaintTheBoard implements Runnable {

	GameBoard theBoard;

	public RepaintTheBoard(GameBoard theBoard) {

		this.theBoard = theBoard;

	}

	@Override

	public void run() {

		// Redraws the game board

		theBoard.repaint();

	}

}
