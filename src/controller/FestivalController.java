package controller;

import java.util.List;

import dao.FestivalDAO;
import model.Festival;
import model.Scene;

public class FestivalController {

	FestivalDAO festivalDao = new FestivalDAO();

	public List<Festival> getAllFestivals() {

		return null;
	}

	/*
	 * public void createFestival(String nom) { Festival festival = new
	 * Festival(nom); festivalDao.addFestivalToList(festival); }
	 */

	public void createFestival(String nom, int annee) {
		Festival festival = new Festival(nom, annee);
		festivalDao.addFestivaltoList(festival);
	}

	public boolean deleteFestivalByName(String name) {

		Festival festivalByName = festivalDao.getFestivalByName(name);

		if (festivalByName != null) {
			festivalDao.deleteFestivalFromList(festivalByName);
			return true;
		}

		return false;
	}

	public void printFestivals() {
		for (Festival festival : festivalDao.getAllFestivals()) {
			System.out.println(festival.getName());
		}
	}

	public boolean createSceneAndAddToFestival(String nomFestival, String nomScene) {

		Festival f = festivalDao.getLastFestivalByName(nomFestival);
		if (f == null)
			return false;

		Scene s = new Scene(nomScene);
		return festivalDao.addSceneToFestival(s, f);
	}

	public boolean deleteSceneFromFestival(String nomFestival, String nomScene) {

		Festival f = festivalDao.getLastFestivalByName(nomFestival);
		Scene s = festivalDao.getLastSceneByNameFromFestival(f, nomScene);

		if (f != null && s != null) {
			return (festivalDao.deleteSceneFromFestival(s, f));

		}
		return false;
	}

	public void printAllScenesNameByFestivalName(String festivalName) {

		// festivalDao.getLastFestivalByName(festivalName);

		for (Scene scene : festivalDao.getLastFestivalByName(festivalName).getScenes()) {
			System.out.print(scene.getName());
		}

	}

	public boolean modificationFestivalByName(String nomFestival, String nomFestivalNew) {

		if (festivalDao.getLastFestivalByName(nomFestivalNew) == null
				&& festivalDao.getLastFestivalByName(nomFestival) != null) {
			Festival f = festivalDao.getLastFestivalByName(nomFestival);
			festivalDao.modifNomFestival(f, "newName");
			return true;
		}
		;

		return false;

		// return

	}

}
