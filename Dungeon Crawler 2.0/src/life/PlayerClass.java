package life;

import util.Utilities;

public class PlayerClass extends AbstractClass {

	public PlayerClass(String name) {
		this.name = name;
		double maxAg = Math.pow(this.ag*3, 1.1);
		double score = 0;
	}
	
	
	public int[] getStats() {
		int[] list = new int[5];
		//add stats here
		return list;
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

}
