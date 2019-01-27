package rooms;

import space.AbstractSpace;
import space.Floor;
import space.Goblin;
import space.Player;
import space.Wall;



//Room creator


public class TestRoom extends AbstractRoom {
	
	public TestRoom(){
		x = 16;
		y = 16;
		room = new AbstractSpace[x][y];{
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
			
			room[4][4] = new Wall();
			room[5][4] = new Wall();
			room[6][4] = new Wall();
			
			room[2][2] = new Goblin("Gublegrabber");
			room[4][2] = new Goblin("Blobmork");
			room[3][2] = new Goblin("Dangelknork");
			room[5][2] = new Goblin("Gorkernab");
		}
	}
	
	
	
	
}
