package space;

public abstract class AbstractSpace {
	char rep = 'X';
	public boolean solid = false;
	public boolean isAlive = false;
	public boolean isNPC = false;
	public boolean isPlayer = false;
	
	public char draw() {
		return rep;
	}
}
