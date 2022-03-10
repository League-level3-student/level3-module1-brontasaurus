package _00_Intro_To_ArrayLists;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class _02_GuestBook implements ActionListener{
	
    /*
     * Create a GUI with two buttons. One button reads "Add Name" and the other
     * button reads "View Names". When the add name button is clicked, display
     * an input dialog that asks the user to enter a name. Add that name to an
     * ArrayList. When the "View Names" button is clicked, display a message
     * dialog that displays all the names added to the list. Format the list as
     * follows:
     * Guest #1: Bob Banders
     * Guest #2: Sandy Summers
     * Guest #3: Greg Ganders
     * Guest #4: Donny Doners
     */
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton view = new JButton();
	JButton add = new JButton();
	
	ArrayList<String> names = new ArrayList<String>();
	
	public static void main(String[] args) {
		
				
	}
	
	public void start(){
		frame.add(panel);
		panel.add(add);
		panel.add(view);
		
		frame.setVisible(true);
		
		view.setText("View Names");
		add.setText("Add Names");
		view.addActionListener(this);
		add.addActionListener(this);
		
		
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (view == e.getSource()) {
			String hold = "";
			for (String s : names) {
				hold = hold+s+"\n";
			}
			JOptionPane.showMessageDialog(null, hold);
		}
		if (add == e.getSource()) {
			
			String s = JOptionPane.showInputDialog("What name would you like to add?");
			
			names.add(s);
		
	}
	
	}
}
