package battle;
import life.AbstractClass;
import util.Utilities;

public class Battle {
	public static boolean battle(AbstractClass Attacker, AbstractClass Defender){
		System.out.println("Battle: "+Attacker.name+" attacking "+Defender.name);
		//if (Attacker.isPlayer) { <-- implement AI in choises if not player
		//int choseAttack = Utilities.getIntLimited(Attacker.getAttacks(), Attacker.getAttackNum());
		//attack = choseAttack(); //For a more complex time
		//target = choseTarget(); //For a more complex time
		
		
		
		
		double[] attackType = ATypeHandler(Attacker, Defender);
		int attackTypeID = (int) attackType[0];
		double landHit = hitLander(attackType[2], Attacker); //how well you land a shot
		boolean dodge = dodger(landHit, Defender);
		double damage = armorCalculation(attackType, Attacker, Defender);
			
		if (!dodge) {
			Defender.hp -= damage;
			System.out.println(Attacker.name+" "+Attacks.getVER(attackTypeID)+" "+Defender.name+" causing "+damage+" damage.");
			if (Defender.hp <= 0) {
				deathHandler(Attacker, Defender);
				System.out.println(Defender.name +" "+Defender.hp+"/"+Defender.maxHp);
			}
			else {
				System.out.println(Attacker.name+" missed the "+Defender.name);
			}
		}
		else {
			System.out.println(Attacker.name+" tried to "+Attacks.getADJ(attackTypeID)+" "+Defender.name+", but missed.");
			Attacker.agXp += 1; //TODO: maybe make more complex
		}
		
		if (Defender.hp > 0) {
			return true;
		}else {
			System.out.println("GotKilled");
			return false;
		}
		
	}

	private static void deathHandler(AbstractClass Attacker, AbstractClass Defender) {
		//TODO: removal of map entity (DONE FOR ENTITY, PLAYER INVISIBLE)
		Attacker.xp += Defender.xpGrant;
		Attacker.score += Defender.scoreGrant;
	}

	static double armorCalculation(double[] attackType, AbstractClass attacker, AbstractClass Defender) {
		double armorMod = attackType[3+Defender.armorType];
		double damage = attacker.st * attackType[1]; //TODO: maybe make more complex
		double finalDamage = armorMod * damage; 
		return finalDamage;
	}

	private static boolean dodger(double landHit, AbstractClass Defender) {
		double dodgeValue = (Math.random() * ((Defender.ag - 0) + 0)) + 0; //TODO: make a range
		//System.out.println("DodgeValue: "+dodgeValue);
		//System.out.println("dodge "+(dodgeValue > landHit));
		return (dodgeValue > landHit);
	}

	static double hitLander(double dif, AbstractClass Attacker) {
		double landHit = dif * Attacker.ag; //TODO: make a range
		//System.out.println("LandHit: "+landHit);
		return landHit;
	}


	private static double[] ATypeHandler(AbstractClass Attacker, AbstractClass Defender) {
		
		int choise = -1;
		
		if (Attacker.isPlayer) { //TODO: make more modular what attacks one can have.
			choise = Utilities.getIntLimited(Attacker.getAttacks(), Attacker.getAttackNum());
		}else {
			choise = AI.AttackTypeAI(Attacker, Defender);
			System.out.println("AI chose attack "+choise);
		}
		double[] attackType= Attacks.AttackType(choise);
		//System.out.println("AttackType: "+attackType);
		return attackType;
	}
}
