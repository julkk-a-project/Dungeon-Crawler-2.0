package lineBattle;

import battle.Battle;
import life.AbstractClass;
import life.Goblin;
import life.PlayerClass;

public class Line {
	
	AbstractClass[][] line;
	
	int x;
	int y;
	
	Line(String name, int x, int y){
		this.x = x;
		this.y = y;
		line = new AbstractClass[x][y];
		for(int i = 0; i < x; i++) {
			for(int j = 0; j < y; j++) {
				line[i][j] = new Goblin(name+" "+i+","+j);
			}
		}
	}
	
	
	public void figth(Line enemy) {

		for(int i = 0; i < x; i++) {
			Battle.battle(this.getFirst(i), enemy.getFirst(i));
		}
	}


	private AbstractClass getFirst(int row) {
		for(int i = 0; i < y; i++) {
			
			AbstractClass guy = line[row][i]; 
			if(guy.hp > 0) {
				return guy;
			}
		}
		return new PlayerClass(); //TODO: handle what when row dies
	}

}
