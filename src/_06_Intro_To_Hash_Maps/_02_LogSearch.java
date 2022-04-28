package _06_Intro_To_Hash_Maps;

import java.util.HashMap;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	HashMap<Integer, String> studentRecords = new HashMap<Integer, String>();
	
	
	public static void main(String[] args) {
		
	
	}

	public void setUp() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		button1.addActionListener(this);
		button1.setText("Button One");
		button2.addActionListener(this);
		button2.setText("Button Two");
		button3.addActionListener(this);
		button3.setText("Button Three");
		frame.setVisible(true);
		frame.pack();
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == button1) {
			String ID = JOptionPane.showInputDialog("Enter ID number");
			
			String name = JOptionPane.showInputDialog("Enter name");
			
			studentRecords.put(Integer.parseInt(ID), name);
		}
		
		if (e.getSource() == button2) {
			String ID = JOptionPane.showInputDialog("Enter ID number");
			
			for (int i = 0; i < studentRecords.size(); i++) {
				if (ID == NEED TO MATCH WITH SOMETHING HELP ME FUTURE ME PLEASE I WANT TO GO HOME) {
					JOptionPane.showMessageDialog(null, studentRecords.get(i));
				}
				else {
					JOptionPane.showMessageDialog(null, "That entry does not exist");
				}
				
			}
		}
		
		
	}
	
	
	
	
	
	
    /*
     * Crate a HashMap of Integers for the keys and Strings for the values.
     * Create a GUI with three buttons.
     * Button 1: Add Entry
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      After an ID is entered, use another input dialog to ask the user
     *      to enter a name. Add this information as a new entry to your
     *      HashMap.
     * 
     * Button 2: Search by ID
     *      When this button is clicked, use an input dialog to ask the user
     *      to enter an ID number.
     *      If that ID exists, display that name to the user.
     *      Otherwise, tell the user that that entry does not exist.
     * 
     * Button 3: View List
     *      When this button is clicked, display the entire list in a message
     *      dialog in the following format:
     *      ID: 123  Name: Harry Howard
     *      ID: 245  Name: Polly Powers
     *      ID: 433  Name: Oliver Ortega
     *      etc...
     * 
     * When this is complete, add a fourth button to your window.
     * Button 4: Remove Entry
     *      When this button is clicked, prompt the user to enter an ID using
     *      an input dialog.
     *      If this ID exists in the HashMap, remove it. Otherwise, notify the
     *      user that the ID is not in the list.
     */

}
