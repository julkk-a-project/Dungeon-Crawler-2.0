package main;
import javax.swing.JOptionPane;

import gui.Window;
import life.AbstractClass;
import life.PlayerClass;
import rooms.AbstractRoom;
import rooms.TestRoom;

public class Game {

	

	public static Window window;
	public PlayerClass player;

	public Game(String playerName) {

		//ROOM CREATOR
		AbstractRoom testRoom = new TestRoom();
		
		
		//initial setup for game

		window = new Window();
		player = new PlayerClass(playerName);
		JOptionPane.showMessageDialog(null, "You'll start your adventure off, by leveling up your level 0 character to level 1!\n"
											+ "we'll grant you 5 points to do that with!");
		player.levelUp(5);

		//places player cords in player
		//index 0 = X, index 1 = Y
		//int[] cords = new int[] {0,0};
		//Player.cords(0,0);
		
		
		
		//Game event handler
		while (player.hp > 0) {//Loop till u die or retire
			//if (Arrays.equals(Player.cords, testRoom)) {
				System.out.println("test");
				AbstractRoom room = testRoom;
				player.cords = RoomPlayer.roomPlayer(room, player);
			//}
		}
		
		//This happens when you die
		Menu.setScore(player.getStats());
		
	}

}
