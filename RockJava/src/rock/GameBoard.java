package rock;

import java.awt.BorderLayout;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


import javax.swing.JFrame;



@SuppressWarnings("serial")
public class GameBoard extends JFrame{
	
	public static int boardWidth = 1000;
	public static int boardHeight = 800;
	
	public static void main (String[] args){
		
		new  GameBoard();
		
	}
	
	public GameBoard(){
		
		this.setSize(boardWidth, boardHeight);
		this.setTitle("Java Asteroids");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addKeyListener(new KeyListener(){

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
				/*
				w: 87
				a: 65
				s: 83
				d: 68
				*/
				
				if(e.getKeyCode()== 87){
					System.out.println("Forward");
				}else if(e.getKeyCode()== 83){
					System.out.println("Backward");
				}
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		}); 
		
		GameDrawingPanel gamePanel = new GameDrawingPanel();
		
		this.add(gamePanel, BorderLayout.CENTER);
		
		ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(5);
		
		executor.scheduleAtFixedRate(new RepaintTheBaord(this), 0L, 20L, TimeUnit.MILLISECONDS);
		
		this.setVisible(true);
	}
	
}


