package classes;

import java.util.Scanner;

public class Menu {
	
	@SuppressWarnings("resource")
	public static int main(String txt, int minValue, int nbChoix, int playerChoice) {
		if(playerChoice == 13) {
			Scanner in = new Scanner(System.in);
			boolean menuState = true;
			while(menuState) {
				System.out.print(txt+"\n-> ");
				int userInput = in.nextInt();
				if(userInput >= minValue && userInput < nbChoix+1) {
					return userInput;
				}else {
					CLS.main();
					System.out.println("Votre choix doit être un nombre compris entre "+ minValue +" et " + nbChoix + ".");
				}
			}
		}else {
			return playerChoice;
		}
		return 0;
	}
	
	@SuppressWarnings("resource")
	public static Nbr playerChoice() {
		Scanner in = new Scanner(System.in);
		System.out.print("\n-> ");
		String userInput = in.nextLine();
		return new Nbr(
				Character.getNumericValue(userInput.charAt(0)),
				Character.getNumericValue(userInput.charAt(1)),
				Character.getNumericValue(userInput.charAt(2)),
				Character.getNumericValue(userInput.charAt(3))
				);
	}
	
	public static int endGame() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		boolean menuState = true;
		while(menuState) {
			System.out.print(StringData.endMenu()+"\n-> ");
			int userInput = in.nextInt();
			if(userInput > -1 && userInput < 3) {
				return userInput;
			}else {
				CLS.main();
				System.out.println("Votre choix doit être un nombre compris entre 0 et 2.");
			}
		}
		return 0;
	}
}