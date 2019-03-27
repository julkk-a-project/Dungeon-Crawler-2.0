package inventory;

import item.AbstractItem;
import item.Empty;
import item.MajorHpPotion;
import item.MajorManaPotion;
import item.MinorHpPotion;
import item.MinorManaPotion;
import item.NoteTest;
import main.Game;

public class PlayerStartingInventory extends AbstractInventory {

	public PlayerStartingInventory() {
		gold = 25;
		x = 5;
		y = 5;
		array = new AbstractItem[x][y];{
			for (int xx = 0; xx < x; xx++) {
				for (int yy = 0; yy < y; yy++) {
						array[xx][yy] = new Empty();
				}
			}
			
			array[0][0] = new MinorHpPotion();
			array[1][0] = new MinorHpPotion();
			array[2][0] = new MajorHpPotion();
			array[0][1] = new MinorManaPotion();
			array[1][1] = new MajorManaPotion();
			array[4][4] = new NoteTest();
			
		}
		
		//Game.window.setInventory(getContents());
		//Game.window.setGold(getGold());
	}
	
	
	
	public String getContents(){
		String string = "";
		for (int yy = y-1; yy >= 0; yy--) {
			for (int xx = 0; xx <= x-1; xx++) {
				String comma = "";
				if (xx != x-1) {
					comma = ",";
				}
				string +=array[xx][yy].draw()+comma;
			}
			string += "\n";
		}
		//for (int xxx = 0; xxx < x; xxx++) {
		//	String comma = "";
		//	if (xxx != x-1) {
		//		comma = "";
		//	}
		//	string += xxx+comma;
		//}
		
		return string;
	}
	public int getGold() {
		return (int) gold;
	}

}
