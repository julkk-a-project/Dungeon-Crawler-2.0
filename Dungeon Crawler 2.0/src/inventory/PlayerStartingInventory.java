package inventory;

import item.AbstractItem;
import item.Empty;
import item.MajorHpPotion;
import item.MajorManaPotion;
import item.MinorHpPotion;
import item.MinorManaPotion;
import item.NoteTest;

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
		
		
		
	}
	
	
	
	public String getContents(){
		String string = "";
		string += String.valueOf("Gold: "+gold+"\n\n");
		for (int yy = y-1; yy >= 0; yy--) {
			string += "\n";
			for (int xx = 0; xx <= x-1; xx++) {
				string +=array[xx][yy].draw()+",";
			}
		}
		return string;
	}

}
