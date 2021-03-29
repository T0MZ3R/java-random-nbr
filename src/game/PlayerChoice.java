package game;

import classes.CLS;
import classes.Menu;
import classes.Nbr;
import classes.StringData;

public class PlayerChoice {
	Nbr secret;
	Nbr playerChoice;
	int attempt;
	
	public PlayerChoice() {
		attempt = 0;
		secret = new Nbr();
		CLS.main();
		System.out.print(StringData.playerGameMenu());
	}
	
	public int loop() {
		playerChoice = Menu.playerChoice();
		Boolean gameState = true;
		while(gameState) {
			if(!playerChoice.boolEquals(secret) && attempt < 9) {
				System.out.println(playerChoice.strEquals(secret));
				playerChoice = Menu.playerChoice();
				attempt += 1;
				System.out.println();
			}
			else if(playerChoice.boolEquals(secret)){
				System.out.println("Victory !");
				gameState = false;
			}else if(attempt >= 9) {
				System.out.println("Défaite !\n Vous avez fait plus de 10 essaies.");
				gameState = false;
			}
		}
		return Menu.endGame();
	}
}
