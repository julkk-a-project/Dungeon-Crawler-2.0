package util;


import javax.swing.JOptionPane;


public class Utilities {

	

	public static int confirmer(String string) { // asks user a Yes/No question
		String[] mojligheter = new String [] {"Yes", "No"};
		int svar = JOptionPane.showOptionDialog(null,
				string," ",
				JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,
				mojligheter, mojligheter[0]);
		return svar;
	}
	public static int directionForcer (String message) {
		String string = JOptionPane.showInputDialog(message);
		int integer = 5;
		try {
			integer = Integer.parseInt(string);
		} catch (Exception e) {
			if (string.equals("5"))
			return integer;
		}
		finally{
			return integer;
		}
	}
	
	
}
