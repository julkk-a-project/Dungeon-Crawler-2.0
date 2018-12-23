import javax.swing.JOptionPane;

import life.PlayerClass;

public class Game {

	

	public static int[] game(String playerName) {
		PlayerClass Player = new PlayerClass(playerName);
		JOptionPane.showMessageDialog(null, "You'll start your adventure off, by leveling up your level 0 character to level 1!\n"
											+ "we'll grant you 5 points to do that with!");
		Player.levelUp(5);
		
		
		
		while (Player.hp > 0) {//Loop til u die or retire
			
		}
		return Player.getStats(); //This when you die

	}

}
