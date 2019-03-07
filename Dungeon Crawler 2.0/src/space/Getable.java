package space;

import item.AbstractItem;

public interface Getable {

	AbstractItem item = new AbstractItem();
	
	public static AbstractItem getItem(){
		return item;
	}
	
	
}
