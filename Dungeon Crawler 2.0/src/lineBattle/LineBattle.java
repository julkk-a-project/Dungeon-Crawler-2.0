package lineBattle;

import gui.Window;

public class LineBattle {

	public static void main(String[] args) {
		Line line1 = new Line("Blue",1000,1000);
		Line line2 = new Line("Red",1000,1000);
		Window window = new Window();
		
		
		while(true) {
			line1.figth(line2);
			line2.figth(line1);
		}

	}

}
