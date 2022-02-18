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

	public void createFestival(String nom) {
		// TODO Auto-generated method stub
		Festival festival = new Festival(nom);
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

	public void createSceneAndAddToFestival(String nomFestival, String nomScene) {
		Festival f = festivalDao.getLastFestivalByName(nomFestival);
		Scene s = new Scene(nomScene);
		festivalDao.addSceneToFestival(s, f);
	}

	public boolean deleteSceneFromFestival(String nomFestival, String nomScene) {
		Festival f = festivalDao.getLastFestivalByName(nomFestival);

		return false;
	}

}
