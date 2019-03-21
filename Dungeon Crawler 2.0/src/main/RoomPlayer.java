package main;
import javax.swing.JOptionPane;

import battle.Battle;
import gui.Window;
import item.MinorHpPotion;
import life.AbstractClass;
import rooms.*;
import space.AbstractSpace;
import space.Entity;
import space.Floor;
import space.Getable;
import space.HealthPickup;

public class RoomPlayer {

	
	public static int[] roomPlayer(AbstractRoom Room, AbstractClass Player) {
		String map = null;
		int x = Room.x;
		int y = Room.y;
		int[] hasPlayer = new int[2]; //X,Y
		//boolean hasAlive = false; //maybe make into a sort of list
		boolean playerInside = true;
		
		//as long as player is inside
		while (playerInside) {
			
			
			//System.out.println("--------------");

			//Reads room
			map = "";
			for (int yy = y-1; yy >= 0; yy--) { 
				for (int xx = 0; xx < x; xx++) {
					if (Room.room[xx][yy].isAlive && Room.room[xx][yy].notKilled) {
						//handels ActionPoints for AI
						Room.room[xx][yy].AP += 1;
					}else if (!Room.room[xx][yy].notKilled) {
						//KillEvent //TODO: add loot?
						Room.room[xx][yy] = new HealthPickup(2);
					}
					if (Room.room[xx][yy].isPlayer) {
						hasPlayer[0] = xx;
						hasPlayer[1] = yy;
					}
				}
			}
			
			//Moves AI
			for (int yy = y-1; yy >= 0; yy--) { 
				for (int xx = 0; xx < x; xx++) {
					map += Room.room[xx][yy].draw();
					if (Room.room[xx][yy].isAlive && (Room.room[xx][yy].AP > 0)) { //TODO: make AP calc more complex
						Room.room[xx][yy].AP -= 1;
						int[] self = {xx,yy};
						moveHandler(Room, self, Room.room[xx][yy].AI(Room, self, hasPlayer), Player); //TODO: parameter "Player" should be implemented in a better way.
					}
				}
				map += "\n";
			}
			
			//Draws room
			map = "";
			for (int yy = y-1; yy >= 0; yy--) { 
				for (int xx = 0; xx < x; xx++) {
					map += Room.room[xx][yy].draw();
				}
				map += "\n";
			}
			
			Window.view.setText(map);
		
			
			
			
			
			
			//Temp solution to show and move player
			int direction = util.Utilities.directionForcer(map+"\n\nUse numpad to move");
			playerInside = Player.notKilled;
			moveHandler(Room, hasPlayer, direction);
		
		}
		
		int[] cords = new int[] {0,0}; //change this to make player move to other room
		return cords;
	}
	
	private static AbstractRoom moveHandler(AbstractRoom room, int[] self, int direction){ //make direction display like numpad
		int[] moveCord = new int[2]; 
		//default swap TODO: combine with line above.
		moveCord[0] = self[0];
		moveCord[1] = self[1];
		

		//add all 8 directions to move to w/ solid chekker
		
		switch(direction) {
		case 7:
			moveCord[0] = self[0] - 1;
			moveCord[1] = self[1] + 1;
			break;
		case 8:
			moveCord[0] = self[0];
			moveCord[1] = self[1] + 1;
			break;
		case 9:
			moveCord[0] = self[0] + 1;
			moveCord[1] = self[1] + 1;
			break;
		case 4:
			moveCord[0] = self[0] - 1;
			moveCord[1] = self[1];
			break;
		case 6:
			moveCord[0] = self[0] + 1;
			moveCord[1] = self[1];
			break;
		case 1:
			moveCord[0] = self[0] - 1;
			moveCord[1] = self[1] - 1;
			break;
		case 2:
			moveCord[0] = self[0];
			moveCord[1] = self[1] - 1;
			break;
		case 3:
			moveCord[0] = self[0] + 1;
			moveCord[1] = self[1] - 1;
			break;
//		case 100:
//			JOptionPane.showMessageDialog(null, self.Inventory.getContents());
//			break;
//		case 1488:
//			Player.hp = -1488;
//			break;
			
		}
		
		
		
		AbstractSpace target = AbstractSpace room.room[moveCord[0]][moveCord[1]];
		Entity Self = (Entity) room.room[self[0]][self[1]];
		
		
		if (target.isNPC) {
			//add encounter event
		}
		else if (Self.isPlayer && target.playerInteract) {
			self.addInventory(Getable.getItem());
			swapper(room, self, moveCord);
		}
		else if (Self.isPlayer && target.isAlive && !target.isPlayer) {
			//Entity TargetE = room.room[moveCord[0]][moveCord[1]];
			target.notKilled = Battle.battle(Player, target.getKlass()); //use interface instead of superclass for "Class"
		}
		else if (!Self.isPlayer && target.isAlive && !target.isPlayer && (Self != target)) {
			//Entity TargetE = room.room[moveCord[0]][moveCord[1]];
			target.notKilled = Battle.battle(Self.getKlass(), target.getKlass()); //use interface instead of superclass for "Class"
		}
		else if (!Self.isPlayer && target.isPlayer) {
			//Entity TargetE = room.room[moveCord[0]][moveCord[1]];
			Player.notKilled = Battle.battle(Self.getKlass(), target.getKlass()); //use interface instead of superclass for "Class"
		}
		else if (!target.solid) {
			swapper(room, self, moveCord);
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
