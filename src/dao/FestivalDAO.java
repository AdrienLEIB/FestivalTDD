package dao;

import java.util.ArrayList;
import java.util.List;

import model.Data;
import model.Festival;
import model.Scene;

public class FestivalDAO {

	Festival f1;
	Festival f2;
	Festival f3;

	// List<Festival> festivals;

	public FestivalDAO() {
		f1 = new Festival();
		f2 = new Festival();
		f3 = new Festival();

		Data.setFestivals(new ArrayList<>());
	}

	public List<Festival> getAllFestivals() {
		return Data.getFestivals();
	}

	public boolean addFestivaltoList(Festival festival) {
		return (Data.getFestivals().add(festival));
	}

	public boolean deleteFestivalFromList(Festival festival) {

		return (Data.getFestivals().remove(festival));
	}

	public Festival getFestivalByName(String name) {

		Festival fToReturn = null;

		for (Festival f : Data.getFestivals()) {
			if (f.getName().equals(name)) {
				fToReturn = f;
			}
		}

		return fToReturn;
	}

	public boolean addSceneToFestival(Scene scene, Festival festival) {
		return festival.getScenes().add(scene);
	}

}
