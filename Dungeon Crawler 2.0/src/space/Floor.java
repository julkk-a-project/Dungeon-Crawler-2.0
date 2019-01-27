package space;

import item.AbstractItem;

public class Floor extends AbstractSpace {

	public Floor() {
		this.rep = '-';
	}
	
	public Floor(AbstractItem Item) {
		this.rep = '+';
		playerInteract = true;
		AbstractItem item = Item;
	}
	
	public AbstractItem getItem(){
		AbstractItem tempItem = item;
		item = null;
		playerInteract = false;
		rep = '-';
		return tempItem;
	}

}
