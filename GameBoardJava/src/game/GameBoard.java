package game;

//Layout used by the JPanel
import java.awt.BorderLayout;


//Allows me to draw and render shapes on components

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

//Will hold all of my Rock objects

//Runs commands after a given delay
import java.util.concurrent.ScheduledThreadPoolExecutor;

//Defines time units. In this case TimeUnit.MILLISECONDS
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;

import javax.sound.sampled.*;
import java.io.IOException;
import java.net.*;
import javax.swing.*;


@SuppressWarnings("serial")
public class GameBoard extends JFrame {

	// Height and width of the game board

	public static int boardWidth = 1000;

	public static int boardHeight = 800;
	
	public static boolean keyHeld = false;
	
	public static int keyHeldCode;
	
	public static ArrayList<PhotonTorpedo> torpedos = new ArrayList<PhotonTorpedo>();
	
	String thrustFile = "file:./src/thrust.au";
	String laserFile = "file:./src/laser.aiff";

	public static void main(String[] args)

	{

		new GameBoard();

	}

	public GameBoard()

	{

		// Define the defaults for the JFrame

		this.setSize(boardWidth, boardHeight);

		this.setTitle("Java Asteroids");

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		addKeyListener(new KeyListener() {

			@Override

			public void keyTyped(KeyEvent e) {

				// TODO Auto-generated method stub

			}

			@Override

			public void keyPressed(KeyEvent e) {

				// TODO Auto-generated method stub


				if (e.getKeyCode() == 87){
					System.out.println("Forward");
					playSoundEffect(thrustFile);
					keyHeldCode = e.getKeyCode();
					keyHeld = true;
				} else if (e.getKeyCode() == 83) {
					System.out.println("Backward");
					keyHeldCode = e.getKeyCode();
					keyHeld = true;
				}else if(e.getKeyCode() == 68){
					System.out.println("Rotate Right");
					keyHeldCode = e.getKeyCode();
					keyHeld = true;
				}else if(e.getKeyCode() == 65){
					System.out.println("Rotate Left");
					keyHeldCode = e.getKeyCode();
					keyHeld = true;
				}
				
				else if(e.getKeyCode()== KeyEvent.VK_ENTER){
					System.out.println("Shoot");
					playSoundEffect(laserFile);
					torpedos.add(new PhotonTorpedo(GameDrawingPanel.theShip.getShipNoseX(), GameDrawingPanel.theShip.getShipNoseY(), GameDrawingPanel.theShip.getRotationAngle()));
				}

			}

			@Override

			public void keyReleased(KeyEvent e) {
				
				keyHeld = false;
				
			}

		});

		GameDrawingPanel gamePanel = new GameDrawingPanel();

		// Make the drawing area take up the rest of the frame

		this.add(gamePanel, BorderLayout.CENTER);

		// Used to execute code after a given delay

		// The attribute is corePoolSize - the number of threads to keep in

		// the pool, even if they are idle

		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);

		// Method to execute, initial delay, subsequent delay, time unit

		executor.scheduleAtFixedRate(new RepaintTheBoard(this), 0L, 20L, TimeUnit.MILLISECONDS);

		// Show the frame

		this.setVisible(true);

	}
	
	public static void playSoundEffect (String soundToPlay){
		
		URL soundLocation;
		
		try{
			
			soundLocation = new URL(soundToPlay);

			Clip clip = null;
			
			clip = AudioSystem.getClip();
			
			AudioInputStream inputStream;
			
			inputStream = AudioSystem.getAudioInputStream(soundLocation);
			
			clip.open(inputStream);
			clip.loop(0);
			clip.start();
		}
		
		catch (MalformedURLException e1){
			e1.printStackTrace();
		}
		
		catch (UnsupportedAudioFileException e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
		
		catch(LineUnavailableException e1){
			e1.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

// Class implements the runnable interface
// By creating this thread we can continually redraw the screen
// while other code continues to execute

/*
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
*/

/*
@SuppressWarnings("serial")

// GameDrawingPanel is what we are drawing on

class GameDrawingPanel extends JComponent {

	// Holds every Rock I create

	public static ArrayList<Rock> rocks = new ArrayList<Rock>();

	// Get the original x & y points for the polygon

	int[] polyXArray = Rock.sPolyXArray;

	int[] polyYArray = Rock.sPolyYArray;

	// Create a SpaceShip

	SpaceShip theShip = new SpaceShip();

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

		}

	}

	public void paint(Graphics g) {

		// Allows me to make many settings changes in regards to graphics

		Graphics2D graphicSettings = (Graphics2D) g;

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

			rock.move();

			// Stroke the polygon Rock on the screen

			graphicSettings.draw(rock);

		}

		theShip.move();

		graphicSettings.draw(theShip);

	}

}

*/