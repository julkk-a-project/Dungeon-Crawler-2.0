package battle;

import java.util.ArrayList;

import life.AbstractClass;

public class AI {
	public static int AttackTypeAI(AbstractClass Attacker, AbstractClass Defender) {
		ArrayList<Integer> types = Attacker.getAttackList();
		int max = types.size();
		double[] typeDamage = new double[max];
		
		//Simulates all possible attacks which it can use
		//Times simulation is ran comes from creatures own intelligence.
		//This brings more randomness to less intelligent creatures, and gives intelligence value.
		for (int tryTime = 0; tryTime < Attacker.intel; tryTime++) {
			for (int type = 0; type < max; type++) {
				//hit chanse multiplied by damage dealt in simulation
				typeDamage[tryTime] += Battle.hitLander(Attacks.AttackType(type)[2], Attacker)*(Battle.armorCalculation(Attacks.AttackType(type), Attacker, Defender));
			}
		}
		
		
		//finds the best alternative according to simulation
		int bestAttackID = -1;
		double bestDamage = -100;
		for (int type = 0; type < max; type++) {
			if (typeDamage[type] >= bestDamage) {
				bestDamage = typeDamage[type];
				bestAttackID = type;
			}
		}
		
		
		return bestAttackID;
	}
}
