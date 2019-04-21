package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.Scrollable;

public class Window extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static JTextArea view;
	public static JTextArea log;
	private JTextArea inventory;
	private JLabel goldLable;
	private JTextArea gold;
	
	public Window(){
		setLayout(new GridBagLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		//setVisible(true);
		

		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints.FIRST_LINE_START;
		c.weightx = 0.5;
		//c.fill = GridBagConstraints.NORTH;


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
		log = new JTextArea("I am the log");
		//log.setPreferredSize(new Dimension( 2000,2000));
		log.setEditable(false);
		JScrollPane logScroll = new JScrollPane(log);
		logScroll.setPreferredSize(new Dimension( 800,300));
		add(logScroll,c);
		
		logScroll.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener() {  
	        public void adjustmentValueChanged(AdjustmentEvent e) {  
	            e.getAdjustable().setValue(e.getAdjustable().getMaximum());  
	        }
	    });
		
		

		//inventory lable
		c.gridx = 0;
		c.gridy = 1; 
		goldLable = new JLabel("This is ur gold:");
		add(goldLable,c);

		//Inventory
		
		c.gridx = 0;
		c.gridy = 2; 
		inventory = new JTextArea("This is the inventory",5,5);
		inventory.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		inventory.setEditable(false);
		add(inventory,c);
		
		//use button
		c.gridx = 1;
		c.gridy = 1;
		JButton use = new JButton("Use");
		add(use,c);
		
		//look button
		c.gridx = 1;
		c.gridy = 2;
		JButton look = new JButton("Look");
		add(look,c);
		
		//gold lable
		c.gridx = 1;
		c.gridy = 1; 
		goldLable = new JLabel("This is ur gold:");
		add(goldLable,c);
		
		//Gold
		c.gridx = 2;
		c.gridy = 1; 
		gold = new JTextArea("???",5,5);
		gold.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 12));
		gold.setEditable(false);
		add(gold,c);
		
		
		pack();
		setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		 
	}



	public void setInventory(String contents) {
		inventory.setText(contents);
		
	}
	public void setGold(int gold) {
		this.gold.setText(Integer.toString(gold));
	}

}
