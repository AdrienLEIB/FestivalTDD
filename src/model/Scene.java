package model;

import java.util.List;

public class Scene {

	List<Groupe> groupes;

	String name;

	public Scene(List<Groupe> groupes, String name) {
		super();
		this.groupes = groupes;
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

	public Scene(String name) {
		super();
		this.name = name;
	}

	public Scene() {
		super();
	}

}
