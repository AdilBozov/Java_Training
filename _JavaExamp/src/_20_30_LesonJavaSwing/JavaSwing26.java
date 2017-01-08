package _20_30_LesonJavaSwing;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import java.util.Date;
import java.util.Calendar;

public class JavaSwing26 extends JFrame {
	
	JButton button1;
	JSpinner spinner1, spinner2, spinner3, spinner4;
	String outputString = "";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JavaSwing26();

	}
	
	public JavaSwing26(){
		
		this.setSize(400, 400);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setTitle("My Frame");
		
		JPanel thePanel = new JPanel();
		
		//Create a button
		button1 = new JButton("Get Answer");
		ListenerForButton lForButton =new ListenerForButton();
		button1.addActionListener(lForButton);
		thePanel.add(button1);
		
		//Create spinner1
		spinner1 = new JSpinner();
		Dimension m = spinner1.getPreferredSize();
		m.width = 80;
		//m.height = 80;
		spinner1.setPreferredSize(m);
		thePanel.add(spinner1);
		
		//Create spinner2
		spinner2 = new JSpinner(new SpinnerNumberModel(1, 1, 100, 1));
		thePanel.add(spinner2);
		
		//Create spinner3
		String[] weekDays = {"Mon", "Tues", "Weds", "Thurs", "Fri"};
		spinner3 = new JSpinner(new SpinnerListModel(weekDays));
		Dimension d = spinner3.getPreferredSize();
		d.width = 80;
		spinner3.setPreferredSize(d);
		thePanel.add(spinner3);
		
		//Create spinner4
		Date todaysDate = new Date();
		spinner4 = new JSpinner(new SpinnerDateModel(todaysDate, null, null, Calendar.DAY_OF_MONTH));
		JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(spinner4,  "dd/MM/yy");
		spinner4.setEditor(dateEditor);
		thePanel.add(spinner4);
		//ListenerForSpinner lForSpinner = new ListenerForSpinner();
		//spinner4.addChangeListener(lForSpinner);
		
		this.add(thePanel);
		
		this.setVisible(true);
	}
	
	private class ListenerForButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == button1){
				outputString += "Spinner 1 Value: " + spinner1.getValue() + "\n";
				outputString += "Spinner 2 Value: " + spinner2.getValue() + "\n";
				outputString += "Spinner 3 Value: " + spinner3.getValue() + "\n";
				outputString += "Spinner 4 Value: " + spinner4.getValue() + "\n";
				
				JOptionPane.showMessageDialog(JavaSwing26.this, outputString, "Information", JOptionPane.INFORMATION_MESSAGE);
				
				outputString = "";
			}
		}
	}
}
