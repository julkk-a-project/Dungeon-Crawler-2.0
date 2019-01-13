import java.util.Arrays;

import javax.swing.JOptionPane;

import life.PlayerClass;
import rooms.AbstractRoom;
import rooms.TestRoom;

public class Game {

	

	public static int[] game(String playerName) {

		//MAP
		int[] testRoom = new int[] {0,0};
		
		
		//initial setup for game
		
		PlayerClass Player = new PlayerClass(playerName);
		JOptionPane.showMessageDialog(null, "You'll start your adventure off, by leveling up your level 0 character to level 1!\n"
											+ "we'll grant you 5 points to do that with!");
		Player.levelUp(5);

		//places player cords in player
		//index 0 = X, index 1 = Y
		//int[] cords = new int[] {0,0};
		//Player.cords(0,0);
		
		
		
		//Game event handler
		while (Player.hp > 0) {//Loop till u die or retire
			//if (Arrays.equals(Player.cords, testRoom)) {
				System.out.println("test");
				AbstractRoom Room1 = new TestRoom();
				Player.cords = RoomPlayer.roomPlayer(Room1, Player);
			//}
		}
		return Player.getStats(); //This when you die

	}

}
