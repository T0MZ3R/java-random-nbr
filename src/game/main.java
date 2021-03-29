package game;

import classes.CLS;
import classes.Menu;
import classes.StringData;

public class main {

	public static void main(String[] args) {
		int playerMenuChoice = 13;
		Boolean programState = true;
		while(programState) {
			CLS.main();
			switch(Menu.main(StringData.mainMenu(),0, 2, playerMenuChoice)){
				case 0:
					// Quit game
					programState = false;
					break;
				case 1:
					PlayerChoice playerGame = new PlayerChoice();
					switch(playerGame.loop()) {
						case 0:
							// Quit game
							programState = false;
							break;
						case 1:
							// Change mode
							playerMenuChoice = 13;
							break;
						case 2:
							// Restart mode
							playerMenuChoice = 1;
							break;
					}
					break;
				case 2:
					IaChoice iaGame = new IaChoice();
					switch(iaGame.loop()) {
						case 0:
							// Quit game
							programState = false;
							break;
						case 1:
							// Change mode
							playerMenuChoice = 13;
							break;
						case 2:
							// Restart mode
							playerMenuChoice = 2;
							break;
					}
					break;
			}
		}
		
	}

}
