package _RecursionAndRecursiveAlgorithms;

public class Shortcut {
	
	static char[][] lab = {
			{' ', ' ', ' ', '*', ' ', ' ', ' '},
			{'*', '*', ' ', '*', ' ', '*', ' '},
			{' ', ' ', ' ', ' ', ' ', ' ', ' '},
			{' ', '*', '*', '*', '*', '*', ' '},
			{' ', ' ', ' ', ' ', ' ', ' ', 'e'}
			};
	
	static int numRows = lab.length;
	static int numCols = lab[0].length;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindExit(0, 0);

	}

	static void FindExit(int row, int col) {
		// TODO Auto-generated method stub
		if(row < 0 || col < 0 || row >= numRows || col >= numCols){
			// Out of labyrinth
			return;
		}
		
		if(lab[row][col] == 'e'){
			// Cell already visited
			
			System.out.println("Exit found!");
			Print();
			return;
		}
		
		if(lab[row][col] != ' '){
			// Cell already visited or is wall
			return;
		}
		
		lab[row][col] = 'x';
		
		FindExit(row, col + 1);// Right
		FindExit(row + 1, col);// Down
		FindExit(row, col - 1);// Left
		FindExit(row - 1, col);// Up
		
		lab[row][col] = ' ';
	}

	static void Print() {
		// TODO Auto-generated method stub
		
		for(int row = 0; row < numRows; row++){
			for (int col = 0; col < numCols; col++){
				System.out.print(lab[row][col]);
			}
			System.out.println();
		}
		System.out.println();
	}

}
