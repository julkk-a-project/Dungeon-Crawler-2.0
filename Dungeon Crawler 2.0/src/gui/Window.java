package gui;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Window extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JTextArea view;
	public static JTextArea log;
	public static JTextArea inventory
	;

	
	public Window(){
		setLayout(new GridBagLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		//JButton button = new JButton("Press");
		//getContentPane().add(button); // Adds Button to content pane of frame
		//setVisible(true);
		

		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		c.weightx = 0.5;
		//c.fill = GridBagConstraints.NORTH;

		c.gridx = 0;
		c.gridy = 0;
		//upperLeft.add(new Label("Data Series"), c);

		//RoomPlayer
		c.gridx = 0;
		c.gridy = 0; 
		view = new JTextArea("I am the room player view",16,16);
		view.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		view.setEditable(false);
		add(view,c);
		
		//LOG
		c.gridx = 1;
		c.gridy = 0;
		log = new JTextArea(15,40);
		log.setEditable(false);
		add(log,c);

		//Inventory
		c.gridx = 0;
		c.gridy = 1; 
		inventory = new JTextArea("This is the inventory",5,5);
		inventory.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		inventory.setEditable(false);
		add(inventory,c);
		
		
		pack();
		setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		 
	}

}
