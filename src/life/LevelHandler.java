package life;

import javax.swing.JOptionPane;

public class LevelHandler {

	public static int levelMenu(int points, String name, double hp, double maxHp, int st, int mp, double mana, double maxMana, int ag) { //TODO: Add Agility adder
		String[] options = new String [] {"maxHP", "Streingth", "Magic points", "Manapool", "Nothing"};
		int choser = JOptionPane.showOptionDialog(null, "You have "+points+" points to add to your skills, where do you want to invest them? here's your current skills:"
													+"\nHP:           "+hp+"/"+maxHp
													+"\nStreingth:    "+st
													+"\nMagic Poitns: "+mp
													+"\nMana:         "+mana+"/"+maxMana
													+"\nAgility:      "+ag+" (Note that to increase your agility, you need to train it seperately first.)", "You've Leveled up!", JOptionPane.YES_NO_CANCEL_OPTION, 3, null, options, options[2]);
		return choser;
	}
}
