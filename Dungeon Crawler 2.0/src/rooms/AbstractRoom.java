package rooms;

import space.AbstractSpace;
import space.Floor;
import space.Goblin;
import space.Player;
import space.Wall;

public abstract class AbstractRoom {
	
	public int x = 16;
	public int y = 16;
	public AbstractSpace[][] room = new AbstractSpace[x][y];{
		for (int xx = 0; xx < x; xx++) {
			for (int yy = 0; yy < y; yy++) {
				if (xx == 0 || xx == x-1) {
					room[xx][yy] = new Wall();
				}
				else if (yy == 0 || yy == y-1) {
					room[xx][yy] = new Wall();
				}
				else {
					room[xx][yy] = new Floor();
				}
			}
		}
		room[5][5] = new Player();
		
	}
}