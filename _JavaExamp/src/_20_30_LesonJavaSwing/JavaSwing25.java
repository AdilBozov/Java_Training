package _20_30_LesonJavaSwing;

import javax.swing.*;
import java.awt.event.*;

public class JavaSwing25 extends JFrame {
	
	JButton button1;
	String infoOnComponent = " ";
	JList favoriteMovies, favoriteColors;
	DefaultListModel defListModel = new DefaultListModel();
	JScrollPane scroller;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			new JavaSwing25();

	}
	
	public JavaSwing25(){
		this.setSize(400, 400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Fifth frame");
		
		JPanel thePanel = new JPanel();
		
		button1 = new JButton("Get Answer");
		ListenerForBuuton lForButton = new ListenerForBuuton();
		button1.addActionListener(lForButton);
		thePanel.add(button1);
		
		String[] movies = {"Matrix", "MinorIty report", "Big"};
		favoriteMovies = new JList(movies);
		favoriteMovies.setFixedCellHeight(30);
		favoriteMovies.setFixedCellWidth(150);
		favoriteMovies.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		thePanel.add(favoriteMovies);	
		/*
		 * All the methods for lists
		 * 
		 * getSelectedIndex() - return the index for the first select
		 * getSelectedIndexses() - return every selection in a list
		 * getSelectedValue() - return the value of the first select
		 * getSelectedValues() - return an array of all values
		 * in SlectedOndex() - return true if index is selected
		 */
		
		String[] colors = {"Black", "Blue", "White", "Green", "Orange", "Gray", "Pink"};
		for(String color: colors){
			defListModel.addElement(color);
		}
		defListModel.add(2, "Purple");
		favoriteColors = new JList(defListModel);
		favoriteColors.setVisibleRowCount(4);
		scroller = new JScrollPane(favoriteColors,
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		favoriteColors.setFixedCellHeight(30);
		favoriteColors.setFixedCellWidth(150);
		thePanel.add(scroller);
		
		
		
		this.add(thePanel);
		
		this.setVisible(true);
		
	}
	
	private class ListenerForBuuton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource() == button1){
				if(defListModel.contains("Black"))infoOnComponent += "Black is Here\n";
				if(!defListModel.isEmpty())infoOnComponent += "Isn't Empty\n";
				
				infoOnComponent += "Elements in the List " + defListModel.size() + "\n";
				infoOnComponent += "Last Element " + defListModel.lastElement() + "\n";
				infoOnComponent += "First Element" + defListModel.firstElement() + "\n";
				infoOnComponent += "In Index 1" + defListModel.get(1) + "\n";
				
				defListModel.remove(0);
				defListModel.removeElement("Big");
				
				Object[] arrayOfList = defListModel.toArray();
				
				for(Object color: arrayOfList){
					infoOnComponent += color + "\n";
				}
				
				JOptionPane.showMessageDialog(JavaSwing25.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);
				
				infoOnComponent = " ";
						
			}
			
		}
		
	}

}
