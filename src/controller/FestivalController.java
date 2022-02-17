package controller;

import java.util.List;

import dao.FestivalDAO;
import model.Festival;

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

}
