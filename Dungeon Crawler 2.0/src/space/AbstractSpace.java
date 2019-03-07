package space;

import life.AbstractClass;
import rooms.AbstractRoom;

public abstract class AbstractSpace {
	protected static char rep;
	public static boolean solid = false;
	public static boolean playerInteract = false;
	public static boolean isAlive = false;
	public static boolean isSwarmer = false;
	public static boolean isNPC = false;
	public static boolean isPlayer = false;
	public static AbstractClass Class;
	public int AP = 0;
	public boolean notKilled = true;
	
	public char draw() {
		return rep;
	}
	public int AI(AbstractRoom Room, int[] self, int[] hasPlayer) {
		return 5;
		
	}
}
