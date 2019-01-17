package life;

import util.Utilities;

public class PlayerClass extends AbstractClass {
	
	public int[] cords; //used to detect which room player is in

	public PlayerClass(String name) {
		this.klass = "Player";
		isPlayer = true;
		this.name = name;
		double maxAg = Math.pow(this.ag*3, 1.1);
		maxXp = Math.pow(level*3, 2);
		double score = 0;
		int[] cords = new int[] {0,0}; //Cordinates of player. default start 0,0
		hasSLAP = true;
		hasKICK = true;
		hasCLAW = true;
	}
	
	
	public int[] getStats() {
		int[] list = new int[5];
		//add stats here
		return list;
	}
	public void changeCord(int x, int y) //x = 1/-1 to move east/west, y = 1/-1 to move north/south.
	{
		this.cords[0] += x;
		this.cords[1] += y;
	}
	
	public void levelUp(int points) {
		int choise = LevelHandler.levelMenu(points, this.name, this.hp, this.maxHp, this.st, this.mp, this.mana, this.maxMana, this.ag);
		if (choise == 0) {
			this.maxHp += 1;
			this.hp += 1;
			points -= 1;
		}
		else if (choise == 1) {
			this.st += 1;
			points -= 1;
		}
		else if (choise == 2) {
			this.mp += 1;
			points -= 1;
		}
		else if (choise == 3) {
			this.maxMana += 1;
			this.mana += 1;
			points -= 1;
		}
		if (choise == 4 || choise == -1) {
			Utilities.confirmer("Are you sure you don't want to spend all your points?");
		}
		else if (points > 0){
			this.levelUp(points);
		}
	}


	@Override
	public String getAttacks() {
		// TODO Auto-generated method stub
		return null;
	}


}
