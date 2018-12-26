package life;


public abstract class AbstractClass {
	public String name = "???";
	public int level = 1;
	public double hp = 1;
	public double maxHp = 1;
	public int st = 1;
	public int mp = 0;
	public int ag = 1;
	public double xp = 0;
	public double maxXp = Math.pow(level*3, 2);
	public double mana = 0;
	public double maxMana = 0;
	public double manaReg = 0.1;
	public int armorType = 0; //0 = human skin, 1 = Wood, 2 = ticc oger skin, 3 = metalic
	public double xpGrant = 0;
	public double scoreGrant = 0;
}
