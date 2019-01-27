package item;

public class AbstractItem {
	public char rep = ' ';
	public boolean isQuestItem = false; //used to prevent player from discarding important items
	public boolean isEmpty = false;
	
	public char draw() {
		return rep;
	}
}
