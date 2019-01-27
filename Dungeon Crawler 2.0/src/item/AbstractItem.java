package item;

public class AbstractItem {
	protected char rep = ' ';
	public boolean isQuestItem = false; //used to prevent player from discarding important items
	
	public char draw() {
		return rep;
	}
}
