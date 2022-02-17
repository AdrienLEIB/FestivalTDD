package view;

import controller.FestivalController;
import utilis.Utilitaires;

public class Menu {

	FestivalController fc = new FestivalController();

	public void bonjour() {
		System.out.println("Bienvenue a tous");
	}

	public void choix() {
		System.out.println("Que voulez vous faire ?");
		System.out.println("1 Creer un festival");
		System.out.println("2 Ajouter une scene à un festival");
		System.out.println("3 Ajouter un groupe à une scene");

		switch (Utilitaires.saisieString()) {
		case "1":
			System.out.println("1 creation d'un festival");
			System.out.println("Donner un nom a votre festival : ");
			// Festival festival = new Festival(Utilitaires.saisieString());

			fc.createFestival(Utilitaires.saisieString());

			break;
		case "2":
			break;
		case "3":
			break;

		}
	}

}
