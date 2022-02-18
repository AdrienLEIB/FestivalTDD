package view;

import controller.FestivalController;
import utilis.Utilitaires;

public class Menu {

	FestivalController fc = new FestivalController();
	String nomFestival;
	String nomScene;

	public void bonjour() {
		System.out.println("Bienvenue a tous");
	}

	public void choix() {
		System.out.println("Que voulez vous faire ? ");
		System.out.println("1 Creer un festival");
		System.out.println("2 Afficher la liste des festivals");
		System.out.println("3 Ajouter une sc�ne � un festival");
		System.out.println("4 Enlever une sc�ne d'un festival");
		System.out.println("5 Supp un festival");
		System.out.println("6 Modif nom d'un festival");

		// System.out.println("4 Ajouter un groupe � une scence");
		switch (Utilitaires.saisieString()) {
		case "1":
			System.out.println("1 Creation d'un festival");
			System.out.println("Donner un nom � votre festival : ");
			String nom = Utilitaires.saisieString();

			System.out.println("Donner une année à � votre festival : ");
			int annee = Utilitaires.saisieInt();
			fc.createFestival(nom, annee);

			break;
		case "2":
			fc.printFestivals();
			break;
		case "3":
			System.out.println("3 Ajout scene � festival");
			System.out.println("A quel festival voulez vous ajouter une sc�ne, donnez le nom :");
			fc.printFestivals();
			nomFestival = Utilitaires.saisieString();

			System.out.println("Donner un nom � votre scene : ");
			nomScene = Utilitaires.saisieString();

			if (fc.createSceneAndAddToFestival(nomFestival, nomScene)) {
				System.out.println("ok");
			} else {
				System.out.println("Erreur saisie");
			}
			;
			break;
		case "4":
			System.out.println("4 Supp scène d'un festival");
			System.out.println("De quel festival voulez vous enlever une sc�ne, donnez le nom :");
			fc.printFestivals();
			nomFestival = Utilitaires.saisieString();
			fc.printAllScenesNameByFestivalName(nomFestival);

			System.out.println("Quelle scène enlever, donnez le nom :");
			nomScene = Utilitaires.saisieString();

			fc.deleteSceneFromFestival(nomFestival, nomScene);
			break;
		case "5":
			System.out.println("5 Supp un festival");
			System.out.println("Quel festival voulez vous supprimer :");
			fc.printFestivals();
			nomFestival = Utilitaires.saisieString();
			fc.deleteFestivalByName(nomFestival);
			break;
		case "6":
			System.out.println("6 Modification nom d un festival");
			System.out.println("Quel festival voulez vous modif :");
			fc.printFestivals();
			nomFestival = Utilitaires.saisieString();
			System.out.println("Par quel nom voulez vous remplacer :");
			String nomFestivalNew = Utilitaires.saisieString();

			fc.modificationFestivalByName(nomFestival, nomFestivalNew);

		}

	}

}
