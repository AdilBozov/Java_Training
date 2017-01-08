package _20_30_LesonJavaSwing;

import javax.swing.*;
import java.awt.event.*;

public class JavaSwing24 extends JFrame {
	
	JComboBox favoriteShows;
	JButton button1;
	String infoOnComponent = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JavaSwing24();

	}
	
	public JavaSwing24(){
		
		this.setSize(400, 400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My fourth Frame");
		
		JPanel thePanel = new JPanel();
		
		String[] shows ={"Breaking Bad", "Life on Mars", "Doctor who"};
		favoriteShows = new JComboBox(shows);
		favoriteShows.addItem("Pushing Daisies");
		thePanel.add(favoriteShows);
		
		button1 = new JButton("Get Answer");
		
		ListenerForButton lForButton = new ListenerForButton();
		button1.addActionListener(lForButton);
		thePanel.add(button1);
		
		
		this.add(thePanel);
		this.setVisible(true);
		
		favoriteShows.insertItemAt("Dexter", 1);
		favoriteShows.setMaximumRowCount(3);
		favoriteShows.removeItem("Dexter");
		favoriteShows.removeItemAt(1);
	}
	
	private class ListenerForButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == button1){
				
				favoriteShows.setEditable(true);
				
				infoOnComponent += "Item at 0: " + favoriteShows.getItemAt(0) + "\n";
				infoOnComponent += "Num of Shows: " + favoriteShows.getItemCount() + "\n";
				infoOnComponent += "Selected ID: " + favoriteShows.getSelectedIndex() + "\n";
				infoOnComponent += "Selected Value: " + favoriteShows.getSelectedItem() + "\n";
				infoOnComponent += "Are editable: " + favoriteShows.isEditable() + "\n";
				
				JOptionPane.showMessageDialog(JavaSwing24.this, infoOnComponent, "Information", JOptionPane.INFORMATION_MESSAGE);
				
				infoOnComponent = " ";
			}
			
		}
		
	}

}
