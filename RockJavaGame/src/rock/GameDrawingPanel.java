package rock;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JComponent;

import com.sun.prism.Graphics;

class GameDrawingPanel extends JComponent{
	
	public static ArrayList<Rock>  rocks = new ArrayList<Rock>();
	
	int[] polyXArray = Rock.sPolyXArray;
	int[] polyYArray = Rock.sPolyYArray;
	
	SpaceShip theShip = new SpaceShip();
	
	int width = GameBoard.boardWidth;
	int height = GameBoard.boardHeight;
	
	public GameDrawingPanel(){
		
		for(int i = 0; i < 10; i++){
		
			int randomStartXPos = (int)(Math.random()* (GameBoard.boardWidth - 40)+ 1);
			int randomStartYPos = (int)(Math.random()* (GameBoard.boardHeight - 40)+ 1);
			
			rocks.add(new Rock(Rock.getPolyXArray(randomStartXPos), Rock.getPolyYArray(randomStartYPos), 13, randomStartXPos, randomStartYPos));
		
			
		}
	}
	
	public void paint(Graphics g){
		
		Graphics2D graphicSettings = (Graphics2D)g;
		
		graphicSettings.setColor(Color.BLACK);
		
		graphicSettings.fillRect(0, 0, getWidth(), getHeight());
		
		graphicSettings.setRenderingHint(RenderingHints.KEY_ANTIALIASING , RenderingHints.VALUE_ANTIALIAS_ON);
		
		graphicSettings.setPaint(Color.WHITE);
		
		for(Rock rock : rocks){
			
			rock.move();
			
			graphicSettings.draw(rock);
		}
		
		theShip.move();
		
		graphicSettings.draw(theShip);
	}

}
