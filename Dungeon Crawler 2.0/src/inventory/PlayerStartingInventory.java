package inventory;

import item.AbstractItem;
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
		array = new AbstractItem[x][y];
		array[0][0] = new MinorHpPotion();
		array[1][0] = new MinorHpPotion();
		array[2][0] = new MajorHpPotion();
		array[0][1] = new MinorManaPotion();
		array[1][1] = new MajorManaPotion();
		array[4][4] = new NoteTest();
		
	}
	
	
	public String getContents(){
		String string = "";
		string += String.valueOf(gold+"\n\n");
		for (int xx = x-1; xx > 0; xx--) {
			string += "\n";
			for (int yy = y-1; yy > 0; yy--) {
				string +=array[xx][yy].draw();
			}
		}
		return string;
	}

}
