package life;


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
	public double xp = 0;
	public double maxXp = Math.pow(level*3, 2);
	public double mana = 0;
	public double maxMana = 0;
	public double manaReg = 0.1;
	public int armorType = 0; //0 = human skin, 1 = Wood, 2 = ticc oger skin, 3 = metalic
	public double xpGrant = 0;
	public double scoreGrant = 0;
	public abstract String getAttacks();
	public abstract int getAttackNum();
}
