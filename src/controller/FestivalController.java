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

	public void deleteFestivalByName(String name) {

		Festival festival = new Festival(name);
		boolean contains = festivalDao.getAllFestivals().contains(festival);

		if (contains) {
			festivalDao.deleteFestivalFromList(festival);
		}

	}

}
