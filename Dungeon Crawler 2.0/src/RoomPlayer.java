import java.lang.annotation.Target;

import javax.swing.JOptionPane;

import battle.Battle;
import life.AbstractClass;
import life.PlayerClass;
import rooms.AbstractRoom;
import space.AbstractSpace;
import space.Entity;
import space.Floor;
import space.Wall;
import space.Player;

public class RoomPlayer {

	
	public static int[] roomPlayer(AbstractRoom Room, AbstractClass Player) {
		String map = null;
		int x = Room.x;
		int y = Room.y;
		int[] hasPlayer = new int[2]; //X,Y
		boolean hasAlive = false; //maybe make into a sort of list
		boolean playerInside = true;
		
		//as long as player is inside
		while (playerInside) {

			//Reads room
			map = "";
			for (int yy = y-1; yy >= 0; yy--) { 
				for (int xx = 0; xx < x; xx++) {
					map += Room.room[xx][yy].draw();
					if (Room.room[xx][yy].isPlayer) {
						hasPlayer[0] = xx;
						hasPlayer[1] = yy;
					}
				}
				map += "\n";
			}
		
			//Temp solution to show and move player
			int direction = util.Utilities.directionForcer(map+"\n\nUse numpad to move");
			moveHandler(Room, hasPlayer, direction, Player);
		
		}
		
		int[] cords = new int[] {0,0}; //change this to make player move to other room
		return cords;
	}
	
	private static AbstractRoom moveHandler(AbstractRoom room, int[] hasPlayer, int direction, AbstractClass Player){ //make direction display like numpad
		int[] moveCord = new int[2]; 
		
		//default swap
		moveCord[0] = hasPlayer[0];
		moveCord[1] = hasPlayer[1];
		
		//add all 8 directions to move to w/ solid chekker
		if (direction == 7) {
			moveCord[0] = hasPlayer[0] - 1;
			moveCord[1] = hasPlayer[1] + 1;
		}
		else if (direction == 8) {
			moveCord[0] = hasPlayer[0];
			moveCord[1] = hasPlayer[1] + 1;
		}
		else if (direction == 9) {
			moveCord[0] = hasPlayer[0] + 1;
			moveCord[1] = hasPlayer[1] + 1;
		}
		else if (direction == 4) {
			moveCord[0] = hasPlayer[0] - 1;
			moveCord[1] = hasPlayer[1];
		}
		else if (direction == 6) {
			moveCord[0] = hasPlayer[0] + 1;
			moveCord[1] = hasPlayer[1];
		}
		else if (direction == 1) {
			moveCord[0] = hasPlayer[0] - 1;
			moveCord[1] = hasPlayer[1] - 1;
		}
		else if (direction == 2) {
			moveCord[0] = hasPlayer[0];
			moveCord[1] = hasPlayer[1] - 1;
		}
		else if (direction == 3) {
			moveCord[0] = hasPlayer[0] + 1;
			moveCord[1] = hasPlayer[1] - 1;
		}
		
		AbstractSpace Target = room.room[moveCord[0]][moveCord[1]];
		
		if (Target.isNPC) {
			//add encounter event
		}
		else if (Target.isAlive && !Target.isPlayer) {
			//Entity TargetE = room.room[moveCord[0]][moveCord[1]];
			Battle.battle(Player, Target.Class);
		}
		else if (!Target.solid) {
			swapper(room, hasPlayer, moveCord);
		}
		return room;
	}
	private static AbstractRoom swapper(AbstractRoom room, int[] cord1, int[] cord2) {
		//System.out.println("cord1"+cord1[0]+"+cord1[1]);
		//System.out.println("cord2"+cord2[0]+" "+cord2[1]);
		//takes objects into memory
		AbstractSpace Cord1Obj = room.room[cord1[0]][cord1[1]];
		AbstractSpace Cord2Obj = room.room[cord2[0]][cord2[1]];
		
		//swaps objects
		room.room[cord2[0]][cord2[1]] = Cord1Obj;
		room.room[cord1[0]][cord1[1]] = Cord2Obj; 
		
		return room;
	}

}
