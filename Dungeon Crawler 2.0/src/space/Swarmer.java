package space;

import rooms.AbstractRoom;

public class Swarmer extends Entity {

	public Swarmer() {
		isSwarmer = true;
	}

	public int AI(AbstractRoom Room, int[] self, int[] hasPlayer){ //returns numpad direction
		int direction = 5;
		boolean isEast = (self[0] >= hasPlayer[0]);
		boolean isNorth = (self[1] <= hasPlayer[1]);
		//System.out.println("ownCords "+self[0]+","+self[1]);
		//System.out.println("PlayerCords "+hasPlayer[0]+","+hasPlayer[1]);
		
		
		if (isEast && isNorth) {
			if (chek(Room, self, 7)) {
			direction = 7;
			}else if (chek(Room, self, 8)) {
				direction = 8;
			}else if (chek(Room, self, 4)) {
				direction = 4;
			}
		}
		else if (!isEast && !isNorth) {
			if (chek(Room, self, 3)) {
			direction = 3;
			}else if (chek(Room, self, 6)) {
				direction = 6;
			}else if (chek(Room, self, 2)) {
				direction = 2;
			}
		}
		else if (isEast && !isNorth) {
			if (chek(Room, self, 1)) {
			direction = 1;
			}else if (chek(Room, self, 4)) {
				direction = 4;
			}else if (chek(Room, self, 2)) {
				direction = 2;
			}
		}
		else if (!isEast && isNorth) {
			if (chek(Room, self, 9)) {
			direction = 9;
			}else if (chek(Room, self, 8)) {
				direction = 8;
			}else if (chek(Room, self, 6)) {
				direction = 6;
			}
		}
		else if (isNorth) {
			if (chek(Room, self, 8)) {
			direction = 8;
			}else if (chek(Room, self, 7)) {
				direction = 7;
			}else if (chek(Room, self, 9)) {
				direction = 9;
			}		
		}
		else if (isEast) {
			if (chek(Room, self, 4)) {
			direction = 4;
			}else if (chek(Room, self, 7)) {
				direction = 7;
			}else if (chek(Room, self, 1)) {
				direction = 1;
			}		
		}
		else if (!isNorth) {
			if (chek(Room, self, 2)) {
			direction = 2;
			}else if (chek(Room, self, 1)) {
				direction = 1;
			}else if (chek(Room, self, 3)) {
				direction = 3;
			}		
		}
		else if (!isEast) {
			if (chek(Room, self, 6)) {
			direction = 6;
			}else if (chek(Room, self, 9)) {
				direction = 9;
			}else if (chek(Room, self, 3)) {
				direction = 3;
			}		
		}
		
		
		
		//System.out.println(this.Class.name+" "+direction);
		return direction;
	}
	
	boolean chek(AbstractRoom Room, int[] self, int direction) {
		
		int[] moveCord = {self[0], self[1]};
		
		//add all 8 directions to move to w/ solid chekker
				if (direction == 7) {
					moveCord[0] = self[0] - 1;
					moveCord[1] = self[1] + 1;
				}
				else if (direction == 8) {
					moveCord[0] = self[0];
					moveCord[1] = self[1] + 1;
				}
				else if (direction == 9) {
					moveCord[0] = self[0] + 1;
					moveCord[1] = self[1] + 1;
				}
				else if (direction == 4) {
					moveCord[0] = self[0] - 1;
					moveCord[1] = self[1];
				}
				else if (direction == 6) {
					moveCord[0] = self[0] + 1;
					moveCord[1] = self[1];
				}
				else if (direction == 1) {
					moveCord[0] = self[0] - 1;
					moveCord[1] = self[1] - 1;
				}
				else if (direction == 2) {
					moveCord[0] = self[0];
					moveCord[1] = self[1] - 1;
				}
				else if (direction == 3) {
					moveCord[0] = self[0] + 1;
					moveCord[1] = self[1] - 1;
				}
				
		
		AbstractSpace Target = Room.room[moveCord[0]][moveCord[1]];
		
		if (Target.solid || Target.isAlive) {
			return false;
		}else {
			return true;
		}
	}

}
