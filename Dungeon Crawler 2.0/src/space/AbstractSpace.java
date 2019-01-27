package space;

import life.AbstractClass;
import rooms.AbstractRoom;

public abstract class AbstractSpace {
	char rep = 'X';
	public boolean solid = false;
	public boolean isAlive = false;
	public boolean isSwarmer = false;
	public boolean isNPC = false;
	public boolean isPlayer = false;
	public AbstractClass Class;
	public int AP = 0;
	public boolean notKilled = true;
	
	public char draw() {
		return rep;
	}
	public int AI(AbstractRoom Room, int[] self, int[] hasPlayer) {
		return 5;
		
	}
}
