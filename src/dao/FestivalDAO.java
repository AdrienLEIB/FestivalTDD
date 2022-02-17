package dao;

import java.util.ArrayList;
import java.util.List;

import model.Festival;

public class FestivalDAO {

	Festival f1;
	Festival f2;
	Festival f3;
	List<Festival> festivals;

	public void setFestivals(List<Festival> festivals) {
		this.festivals = festivals;
	}

	public FestivalDAO() {
		f1 = new Festival();
		f2 = new Festival();
		f3 = new Festival();
		festivals = new ArrayList<Festival>();
	}

	public List<Festival> getFestivals() {
		return festivals;
	}

	public boolean addFestivalToList(Festival festival) {
		return (festivals.add(festival));
	}

	public boolean deleteFestivalToList(Festival festival) {
		return festivals.remove(festival);
	}

}
