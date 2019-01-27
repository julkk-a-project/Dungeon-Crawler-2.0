package life;

public class Goblin extends Entities {

	public Goblin(String name) {
		this.name = name; //TODO: add namelist
		klass = "Goblin";
		hp = 5;
		maxHp = 5;
		xpGrant = 5;
		scoreGrant = 1;
		hasCLAW = true;
	}

}
