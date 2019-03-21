package space;

import life.AbstractClass;
import rooms.AbstractRoom;

public abstract class AbstractSpace {
	protected char rep;
	public boolean solid = false;
	public boolean playerInteract = false;
	public boolean isAlive = false;
	public boolean isSwarmer = false;
	public boolean isNPC = false;
	public boolean isPlayer = false;
	public static AbstractClass Class;
	public int AP = 0;
	public boolean notKilled = true;
	public AbstractClass klass;
	
	public boolean isSolid() {
		return solid;
	}
	
	public char draw() {
		return rep;
	}
	public int AI(AbstractRoom Room, int[] self, int[] hasPlayer) {
		return 5;
		
	}

	public AbstractClass getKlass() {
		return klass;
	}

}
