package _20_30_LesonJavaSwing;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Dimension;

public class JavaSwingLayout_28 extends JFrame{
	
	JButton button1, button2, button3, button4, button5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JavaSwingLayout_28();
		

	}
	
	public  JavaSwingLayout_28(){
		
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		//JPanel thePanel = new JPanel();
		
		/* FLOW LAYOUT
		*
		*hePanel.setLayout(new FlowLayout(FlowLayout.LEFT));
		*thePanel.setLayout(new FlowLayout(FlowLayout.RIGHT, 30, 20));
		*
		*button1 = new JButton("Button1");
		*thePanel.add(button1);
		
		*button2 = new JButton("Button2");
		*thePanel.add(button2);
		*/
		
		// BORDER LAYOUT
		
		//thePanel.setLayout(new BorderLayout());
		
		button1 = new JButton("Button1");
		button2 = new JButton("Button2");
		button3 = new JButton("Button3");
		button4 = new JButton("Button4");
		button5 = new JButton("Button5");
		/*
		thePanel.add(button1, BorderLayout.NORTH);
		thePanel.add(button2, BorderLayout.NORTH);
		*/
		
		/*
		thePanel.add(button1, BorderLayout.NORTH);
		thePanel.add(button2, BorderLayout.SOUTH);
		thePanel.add(button3, BorderLayout.EAST);
		thePanel.add(button4, BorderLayout.WEST);
		thePanel.add(button5, BorderLayout.CENTER);
		*/
		
		/*
		JPanel thePanel2 = new JPanel();
		
		thePanel2.add(button1);
		thePanel2.add(button2);
		
		thePanel.add(thePanel2, BorderLayout.CENTER);
		*/
		
		
		//BOXLAYOUT
		// Za BoxLayout slagame komentari na syzdadeniq panel "thePanel" i na this.add(thePanel);
		
		Box theBox = Box.createHorizontalBox();
		
		theBox.add(button1);
		theBox.add(Box.createHorizontalStrut(10));
		theBox.add(button2);
		theBox.add(Box.createRigidArea(new Dimension(60, 40)));
		theBox.add(button3);
		theBox.add(Box.createHorizontalGlue());
		theBox.add(button4);
		
		
		
		
		this.add(theBox);
		
		//END BoxLayout
	
		//this.add(thePanel);
		
		this.setVisible(true);
		
		
	}

}
