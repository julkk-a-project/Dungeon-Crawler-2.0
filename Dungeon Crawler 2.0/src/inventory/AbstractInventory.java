package inventory;

import item.AbstractItem;

public abstract class AbstractInventory {
	
	public int x;
	public int y;
	public AbstractItem[][] array;	
	double gold = 0;
	
	public AbstractInventory() {
		
	}
	
	public String getContents(){
		return "";
	}

}
