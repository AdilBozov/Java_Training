package rock;

class RepaintTheBaord implements Runnable{

	GameBoard theBoard;
	
	public RepaintTheBaord(GameBoard theBoard){
		this.theBoard = theBoard;
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		theBoard.repaint();
	}

}
