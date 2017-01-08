package game;

import java.awt.Color;
import java.awt.geom.AffineTransform;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.JComponent;

@SuppressWarnings("serial")

//GameDrawingPanel is what we are drawing on

class GameDrawingPanel extends JComponent {

	// Holds every Rock I create

	public static ArrayList<Rock> rocks = new ArrayList<Rock>();

	// Get the original x & y points for the polygon

	int[] polyXArray = Rock.sPolyXArray;

	int[] polyYArray = Rock.sPolyYArray;

	// Create a SpaceShip

	public static SpaceShip theShip = new SpaceShip();

	// Gets the game board height and weight

	int width = GameBoard.boardWidth;

	int height = GameBoard.boardHeight;

	// Creates 50 Rock objects and stores them in the ArrayList

	public GameDrawingPanel() {

		for (int i = 0; i < 10; i++) {

			// Find a random x & y starting point

			// The -40 part is on there to keep the Rock on the screen

			int randomStartXPos = (int) (Math.random() * (GameBoard.boardWidth - 40) + 1);

			int randomStartYPos = (int) (Math.random() * (GameBoard.boardHeight - 40) + 1);

			// Add the Rock object to the ArrayList based on the attributes sent

			rocks.add(new Rock(Rock.getpolyXArray(randomStartXPos), Rock.getpolyYArray(randomStartYPos), 13,
					randomStartXPos, randomStartYPos));
			
			Rock.rocks = rocks;

		}

	}

	public void paint(Graphics g) {

		// Allows me to make many settings changes in regards to graphics

		Graphics2D graphicSettings = (Graphics2D) g;
		
		AffineTransform identity = new AffineTransform();
		

		// Draw a black background that is as big as the game board

		graphicSettings.setColor(Color.BLACK);

		graphicSettings.fillRect(0, 0, getWidth(), getHeight());

		// Set rendering rules

		graphicSettings.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		// Set the drawing color to white

		graphicSettings.setPaint(Color.WHITE);

		// Cycle through all of the Rock objects

		for (Rock rock : rocks) {

			// Move the Rock polygon

			//rock.move();
			
			if(rock.onScreen){
				
			rock.move	(theShip, GameBoard.torpedos);

			// Stroke the polygon Rock on the screen

			graphicSettings.draw(rock);
			
			}

		}
		
		if(GameBoard.keyHeld == true && GameBoard.keyHeldCode == 68){
			theShip.increaseRotationAngle();
			System.out.println("Ship Angle: " + theShip.getRotationAngle());
		
			//SpaceShip.rotationAngle += 10;
			
		}else if(GameBoard.keyHeld == true && GameBoard.keyHeldCode == 65){
			theShip.decreaseRotationAngle();
			System.out.println("Ship Angle: " + theShip.getRotationAngle());
			//SpaceShip.rotationAngle -= 10;
		}else if(GameBoard.keyHeld == true && GameBoard.keyHeldCode == 87){
			
			theShip.setMovingAngle(theShip.getRotationAngle());
			
			theShip.increaseXVelocity(theShip.shipXMoveAngle(theShip.getMovingAngle())* 0.1);
			theShip.increaseYVelocity(theShip.shipYMoveAngle(theShip.getMovingAngle())* 0.1);
			
			
		}
		
		theShip.move();
		
		graphicSettings.setTransform(identity);
		
		graphicSettings.translate(theShip.getXCenter(), theShip.getYCenter());
		
		graphicSettings.rotate(Math.toRadians(theShip.getRotationAngle()));
		
		graphicSettings.draw(theShip);
		
		for(PhotonTorpedo torpedo : GameBoard.torpedos){
			
			torpedo.move();
			
			if(torpedo.onScreen){
				graphicSettings.setTransform(identity);
				graphicSettings.translate(torpedo.getXCenter(), torpedo.getYCenter());
				graphicSettings.draw(torpedo);
			}
		}

			
		/*
		theShip.move();
		
		graphicSettings.setTransform(identity);
		
		graphicSettings.translate(GameBoard.boardWidth/2, GameBoard.boardHeight/2);
		
		graphicSettings.rotate(Math.toRadians(SpaceShip.rotationAngle));

		graphicSettings.draw(theShip);
	*/
	}

}
