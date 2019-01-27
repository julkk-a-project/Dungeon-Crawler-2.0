package inventory;

import item.AbstractItem;

public abstract class AbstractInventory {
	
	int x;
	int y;
	AbstractItem[][] array;	
	double gold = 0;
	
	public AbstractInventory() {
		
	}
	
	public String getContents(){
		return "";
	}

}
