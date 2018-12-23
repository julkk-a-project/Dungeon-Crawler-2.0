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
	
	
}
