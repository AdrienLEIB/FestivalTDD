package model;

import java.util.ArrayList;
import java.util.List;

public class Scene {

	List<Groupe> groupes;
	public String name;

	public Scene() {
		groupes = new ArrayList<Groupe>();
	}

	public Scene(String name) {
		this.groupes = new ArrayList<Groupe>();
		this.name = name;
	}

	public List<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(List<Groupe> groupes) {
		this.groupes = groupes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
