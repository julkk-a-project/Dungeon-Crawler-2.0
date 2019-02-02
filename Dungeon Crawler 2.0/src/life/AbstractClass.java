package life;

import java.util.ArrayList;

import battle.Attacks;
import inventory.AbstractInventory;
import item.AbstractItem;

public abstract class AbstractClass {
	public boolean isPlayer = false; //used if player in battle	
	public boolean isNPC = false; //used for dialouge people?
	public String name = "???";
	public String klass = "???";
	public int level = 1;
	public double hp = 1;
	public double maxHp = 1;
	public int st = 1;
	public int mp = 0;
	public int ag = 1;
	public int intel = 1;
	public double xp = 0;
	public double maxXp = Math.pow(level*3, 2);
	public double mana = 0;
	public double maxMana = 0;
	public double manaReg = 0.1;
	public int armorType = 0; //0 = human skin, 1 = Wood, 2 = ticc oger skin, 3 = metalic
	public double xpGrant = 0;
	public double scoreGrant = 0;
	public double agXp = 0;
	public double score = 0;
	public AbstractInventory Inventory;
	
	
	protected boolean hasSPIT = true; //special
	protected boolean hasSLAP = false;
	protected boolean hasKICK = false;
	protected boolean hasCLAW = false;
	public boolean notKilled = true;
	
	
	public String getAttacks() {
		String list = "These are your Attacks:\n\n";
		if (hasSLAP){
			list += "0: Slap\n";
		}
		if (hasKICK){
			list += "1: kick\n";
		}
		if (hasCLAW){
			list += "2: Claw\n";
		}
		return list;
	}
	public int getAttackNum() {
		int total = 0;
		if (hasSLAP){
			total ++;
		}
		if (hasKICK){
			total ++;
		}
		if (hasCLAW){
			total ++;
		}
		return total;
	}
	public ArrayList<Integer> getAttackList() {
		ArrayList<Integer> types = new ArrayList<Integer>();
		types.add(-1); //Spit
		
		if (hasSLAP){
			types.add(0);
		}
		if (hasKICK){
			types.add(1);
		}
		if (hasCLAW){
			types.add(2);
		}
		return types;
	}
	
	public abstract void addInventory(AbstractItem item);
	
	
	
	
	
	
}
