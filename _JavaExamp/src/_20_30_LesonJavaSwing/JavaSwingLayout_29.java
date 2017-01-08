package _20_30_LesonJavaSwing;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import java.awt.Insets;

import javax.swing.*;

public class JavaSwingLayout_29  extends JFrame{

	JButton but1, but2, but3, but4, but5, but6, but7, but8, but9, but0, butPlus, butMinus, cleareAll;
	
	JTextField textRezult;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JavaSwingLayout_29();

	}
	
	public JavaSwingLayout_29(){
		// Create the Frame, position it and handel closing it
		
		this.setSize(400, 400);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		JPanel thePanel = new JPanel();
		
		//thePanel.setLayout(new GridLayout(0, 3, 2, 2));
		
		thePanel.setLayout(new GridBagLayout());
		
		GridBagConstraints gridConstrains = new GridBagConstraints();
		
		gridConstrains.gridx = 1;
		gridConstrains.gridy = 1;
		gridConstrains.gridwidth = 1;
		gridConstrains.gridheight = 1;
		gridConstrains.weightx = 50;
		gridConstrains.weighty = 100;
		gridConstrains.insets = new Insets(5,  5 , 5, 5);
		gridConstrains.anchor = GridBagConstraints.CENTER;
		gridConstrains.fill = GridBagConstraints.BOTH;
		
		textRezult = new JTextField("0", 20);
		
		Font font = new Font("Helvetica",Font.PLAIN, 18);
		textRezult.setFont(font);
		
		but1 = new JButton("1");
		but2 = new JButton("2");
		but3 = new JButton("3");
		but4 = new JButton("4");
		but5 = new JButton("5");
		but6 = new JButton("6");
		but7 = new JButton("7");
		but8 = new JButton("8");
		but9 = new JButton("9");
		butPlus = new JButton("+");
		but0 = new JButton("0");
		butMinus = new JButton("-");
		cleareAll = new JButton("C");
		
		thePanel.add(cleareAll, gridConstrains);
		gridConstrains.gridwidth = 20;
		gridConstrains.gridx = 5;
		thePanel.add(textRezult, gridConstrains);
		gridConstrains.gridwidth = 1;
		gridConstrains.gridx = 1;
		gridConstrains.gridy = 2;
		thePanel.add(but1, gridConstrains);
		gridConstrains.gridx = 5;
		thePanel.add(but2, gridConstrains);
		gridConstrains.gridx = 9;
		thePanel.add(but3, gridConstrains);
		gridConstrains.gridx = 1;
		gridConstrains.gridy = 3;
		thePanel.add(but4, gridConstrains);
		gridConstrains.gridx = 5;
		thePanel.add(but5, gridConstrains);
		gridConstrains.gridx = 9;
		thePanel.add(but6, gridConstrains);
		gridConstrains.gridx = 1;
		gridConstrains.gridy = 4;
		thePanel.add(but7, gridConstrains);
		gridConstrains.gridx = 5;
		thePanel.add(but8, gridConstrains);
		gridConstrains.gridx = 9;
		thePanel.add(but9, gridConstrains);
		gridConstrains.gridx = 1;
		gridConstrains.gridy = 5;
		thePanel.add(butPlus, gridConstrains);
		gridConstrains.gridx = 5;
		thePanel.add(but0, gridConstrains);
		gridConstrains.gridx = 9;
		thePanel.add(butMinus, gridConstrains);
		
		
		
		this.add(thePanel);
		
		this.setVisible(true);
		
	}// END OF JavaSwingLayout_29 CONSTRUCTOR

}// END OF JavaSwingLayout_29 CLASS
