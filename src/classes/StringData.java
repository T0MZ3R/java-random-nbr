package classes;

public class StringData {
	public static String mainMenu() {
		return "Nombre mystère\nIl y a uniquement 10 tentatives disponibles.\n\nMode de jeu:\n0 - Quitter le jeu.\n1 - Le programme génère un nombre mystère et le joueur doit le deviner.\n2 - Le joueur indique un nombre mystère et l’ordinateur doit le deviner.";
	}
	
	public static String endMenu() {
		return "Option:\n0 - Quitter le jeu.\n1 - Retour au menu principal.\n2 - Rejouer au même mode de jeu.";
	}
	
	public static String playerGameMenu() {
		return "Ordinateur : Génération d'un nombre aléatoire à 4 chiffres.";
	}
	
	public static String iaGameMenu() {
		return "Entrer un nombre à 4 chiffres aléatoire..";
	}
}
