package gui;

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

	
	public Window(){
		setLayout(new GridBagLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		JButton button = new JButton("Press");
		getContentPane().add(button); // Adds Button to content pane of frame
		setVisible(true);
		
		

		//LOG
		JTextArea room = new JTextArea(15,40);
		room.setEditable(false);
		add(room);
		
		//LOG
		JTextArea log = new JTextArea(15,40);
		log.setEditable(false);
		add(log);
		
		
		
//		pack();
		setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		 
	}

}
