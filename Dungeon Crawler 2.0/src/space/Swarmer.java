package space;

import rooms.AbstractRoom;

public class Swarmer extends Entity {

	public Swarmer() {
		isSwarmer = true;
	}

	public int AI(AbstractRoom Room, int[] self, int[] hasPlayer){ //returns numpad direction
		int direction = 5;
		boolean isEast = (self[0] < hasPlayer[0]);
		boolean isNorth = (self[1] < hasPlayer[1]);
		
		if (isEast && isNorth) {
			//add solid checker
			direction = 7;
		}
		else if (!isEast && !isNorth) {
			//add solid checker
			direction = 3;
		}
		else if (isEast && !isNorth) {
			//add solid checker
			direction = 1;
		}
		else if (!isEast && isNorth) {
			//add solid checker
			direction = 9;
		}
		else if (isNorth) {
			//add solid checker
			direction = 8;			
		}
		else if (isEast) {
			//add solid checker
			direction = 4;			
		}
		else if (!isNorth) {
			//add solid checker
			direction = 2;			
		}
		else if (!isEast) {
			//add solid checker
			direction = 6;			
		}
		
		
		
		
		return direction;
	}

}
