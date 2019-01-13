package space;

public abstract class AbstractSpace {
	char rep = 'X';
	public boolean solid = false;
	
	//not sure if needed
	public boolean isAlive = false;
	public boolean isPlayer = false;
	
	public char draw() {
		return rep;
	}
}
