package space;

import item.AbstractItem;

public class Pickup extends AbstractSpace implements Getable {

	public Pickup() {
		rep = '+';
	}

	
	public AbstractItem getItem() {
		return item;
	}

}
