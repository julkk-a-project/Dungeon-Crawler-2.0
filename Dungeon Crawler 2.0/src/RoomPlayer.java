import javax.swing.JOptionPane;

import life.PlayerClass;
import rooms.AbstractRoom;
import space.Floor;
import space.Wall;
import space.Player;

public class RoomPlayer {

	
	public static int[] roomPlayer(AbstractRoom room) {
		String map = null;
		int x = room.x;
		int y = room.y;
		int[] hasPlayer = new int[2]; //X,Y
		boolean hasAlive = false; //maybe make into a sort of list
		boolean playerInside = true;
		
		//as long as player is inside
		while (playerInside) {
		
			//Reads room
			map = "";
			for (int xx = 0; xx < x; xx++) {
				for (int yy = 0; yy < y; yy++) {
					map += room.room[xx][yy].draw();
					if (room.room[xx][yy].isPlayer) {
						hasPlayer[0] = xx;
						hasPlayer[1] = yy;
					}
				}
				map += "\n";
			}
		
			//Temp solution to show and move player
			String direction = JOptionPane.showInputDialog(map+"\n\nUse numpad to move");
			moveHandler(room, hasPlayer, direction);
		
		}
		
		int[] cords = new int[] {0,0}; //change this to make player move to other room
		return cords;
	}
	
	private static AbstractRoom moveHandler(AbstractRoom room, int[] hasPlayer, String direction){ //make direction display like numpad
		int[] moveCord = new int[2];
		
		//add all 8 directions to move to w/ solid chekker
		
		
		swapper(room, hasPlayer, moveCord);
		
		return room;
	}
	private static AbstractRoom swapper(AbstractRoom room, int[] cord1, int[] cord2) {
		
		//cords will be given in fromat x,y.
		//swap cord1 and cord2 contents
		
		
		return room;
	}

}
