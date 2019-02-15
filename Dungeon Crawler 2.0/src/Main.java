import javax.swing.JOptionPane;

import gui.Window;
import util.Utilities;

public class Main {

	public static void main(String[] args) {
		new Window();
		int choice = 0;
		int[] Score = new int[5];
		while (choice != -1 && choice != 2) { 
			choice = mainMenu();
			if (choice == 0) {
				String playerName = JOptionPane.showInputDialog("Greetings Adventurer! may i ask for your name?");
				Score = Game.game(playerName);
			}
			else if (choice == 1) {
				//Top 10 list (file reader)
			}
			else if (choice == 2 || choice == -1) { 
				int check = Utilities.confirmer("Are you sure you want to go? :(");
				if(check == 0 || check == -1) {
					//when the user chooses to stop playing
				} else {
					choice = 0; //when the user wants to continue playing
				}
			}
		}
	}
	

	public static int mainMenu() {
		String[] options = new String [] {"Play Game", "Top 10 list", "Quit"};
		int choser = JOptionPane.showOptionDialog(null, "You have registered out of 10 cars.\nWhat do you want to do?", "Main Menu", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, options, options[0]);
		return choser;
	}
	
	
	
	
	
	

}
