package battle;
import life.AbstractClass;
import util.Utilities;

public class Battle {
	public static void battle(AbstractClass Attacker, AbstractClass Defender){
		//System.out.println("Battle");
		if (Attacker.isPlayer) {
			int attackType = Utilities.getIntLimited(Attacker.getAttacks(), Attacker.getAttackNum());
			//attack = ChoseAttack(); //For a more complex time
			//target = choseTarget(); //For a more complex time
		}
		
	}

}
