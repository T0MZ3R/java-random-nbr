package classes;

public class StringData {
	public static String mainMenu() {
		return "Nombre myst�re\nIl y a uniquement 10 tentatives disponibles.\n\nMode de jeu:\n0 - Quitter le jeu.\n1 - Le programme g�n�re un nombre myst�re et le joueur doit le deviner.\n2 - Le joueur indique un nombre myst�re et l�ordinateur doit le deviner.";
	}
	
	public static String endMenu() {
		return "Option:\n0 - Quitter le jeu.\n1 - Retour au menu principal.\n2 - Rejouer au m�me mode de jeu.";
	}
	
	public static String playerGameMenu() {
		return "Ordinateur : G�n�ration d'un nombre al�atoire � 4 chiffres.";
	}
	
	public static String iaGameMenu() {
		return "Entrer un nombre � 4 chiffres al�atoire..";
	}
}
