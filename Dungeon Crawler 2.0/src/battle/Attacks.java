package battle;

public class Attacks {

	//attacks list
	
	public static final int TOTALTYPES = 4; //CHANGE ME EVERY TIME YOU ADD NEW ATTACKS!!!!!!!!
	
	public static final int SPIT = -1; //incase type out of range	
	
	public static final int SLAP = 0;
	public static final int KICK = 1;
	public static final int CLAW = 2;
	
	public static final String[] verb = {"slapped", "kicked", "clawed"};
	public static final String[] adjective = {"slap", "kick", "claw"};
	
	
//	public static double[]  Attacks(int attackID) {
//		//in array, return ATTACKVALUE, HITCHANSE, human skin, wood, ticc oger, metalic
//		double[] typeValues = new double[6];
//		typeValues = typeList(attackID);
//		return typeValues;
//	}
	
	public static double[] AttackType(int attackID) {
		//ID, ATTACKVALUE, HITCHANSE, human skin, wood, ticc oger, metalic
		
		if (attackID == 0) { //SLAP
			double TV[] = {0,1,0.9,0.5,0.1,0.25,0.05};
			return TV;
		}
		else if (attackID == 1) { //KICK
			double TV[] = {1,2,0.75,0.75,0.5,0.4,0.4};
			return TV;
		}
		else if (attackID == 2) { //CLAW
			double TV[] = {2,0.9,1,0.2,0.6,0.1};
			return TV;
		}
		
		else { //SPIT (default)
			double TV[] = {-1,0.1,0.666,0.3,0.1,0.2,0.1};
			return TV;
		}
	}
	
	public static String getADJ(int ID) {
		return adjective[ID];
	}
	public static String getVER(int ID) {
		return verb[ID];
	}


}
