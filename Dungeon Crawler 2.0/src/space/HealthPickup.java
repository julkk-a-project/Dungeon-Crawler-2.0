package space;

import item.AbstractItem;

public class HealthPickup extends Pickup implements Getable {

	
	
	
	private AbstractItem item;

	public HealthPickup(double hp) {
		
	}

	@Override
	public AbstractItem getItem() {
		return item;
		
	}

}
