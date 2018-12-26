import life.PlayerClass;
import rooms.AbstractRoom;
import space.Floor;
import space.Wall;
import space.Player;

public class RoomPlayer {

	
	public RoomPlayer(AbstractRoom room) {

		int x = room.x;
		int y = room.y;
		for (int xx = 0; xx < x; xx++) {
			for (int yy = 0; yy < y; yy++) {
				if (room[xx][yy].isPlayer) {
					
				}
			}
		}
		
	}
}
