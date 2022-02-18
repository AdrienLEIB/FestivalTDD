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
		System.out.println("2 Afficher la liste des festivals");
		System.out.println("3 Ajouter une scene à un festival");
		System.out.println("4 Ajouter un groupe à une scene");

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
			System.out.println("3 Ajout scene à festival");
			System.out.println(" A quel festival voulez vous ajouter une scene, donner le .");
			fc.printFestivals();
			String nomFestival = Utilitaires.saisieString();
			System.out.println();
			String nomScene = Utilitaires.saisieString();
			fc.createFestival(nomScene);
			break;
		case "4":
			System.out.println("4 Supp scène d'un festival");
			System.out.println("De quel festival voulez vous enlever une sc�ne, donnez le nom :");
			fc.printFestivals();
			nomFestival = Utilitaires.saisieString();
			System.out.println("Quelle scène enlever, donnez le nom :");
			nomScene = Utilitaires.saisieString();
			break;

		}
	}

}
