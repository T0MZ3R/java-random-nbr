package game;

import classes.CLS;
import classes.Menu;
import classes.Nbr;
import classes.StringData;

public class IaChoice {
	Nbr playerSecret;
	Nbr iaChoice;
	int attempt;
	
	public IaChoice() {
		attempt = 0;
		CLS.main();
		System.out.print(StringData.iaGameMenu());
		playerSecret = Menu.playerChoice();
	}
	
	public int loop() {
		iaChoice = new Nbr();
		System.out.println("playerSecret -> "+ playerSecret.get(0)+""+playerSecret.get(1)+""+playerSecret.get(2)+""+playerSecret.get(3));
		Boolean gameState = true;
		while(gameState) {
			if(!iaChoice.boolEquals(playerSecret) && attempt < 9) {
				System.out.println(iaChoice.strEquals(playerSecret));
				iaChoice = iaGuessSecret(playerSecret);
				System.out.println("Ordinateur -> "+iaChoice.print()+"\n");
				attempt += 1;
				try
				{
				    Thread.sleep(500);
				}
				catch(InterruptedException ex)
				{
				    Thread.currentThread().interrupt();
				}
			}
			else if(iaChoice.boolEquals(playerSecret)){
				System.out.println("Défaite ! Vous avez perdu en "+attempt+" coups.");
				gameState = false;
			}else if(attempt >= 9) {
				System.out.print("Victoire !\n L'ia à fait plus de 10 essaies.");
				gameState = false;
			}
		}
		return Menu.endGame();
	}
	
	private Nbr iaGuessSecret(Nbr playerSecret) {
		String getEquals = iaChoice.strEquals(playerSecret);
		int[] newNbr = new int[4];
		for(int i = 0; i < 4; i++) {
			if(getEquals.charAt(i) == '+') {
				newNbr[i] = iaChoice.get(i)+1;
			}else if(getEquals.charAt(i) == '-'){
				newNbr[i] = iaChoice.get(i)-1;
			}else if(getEquals.charAt(i) == '='){
				newNbr[i] = iaChoice.get(i);
			}
		}
		return new Nbr(newNbr[0],newNbr[1],newNbr[2],newNbr[3]);
	}
}
