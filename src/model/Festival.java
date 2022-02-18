package model;

import java.util.ArrayList;
import java.util.List;

public class Festival {
	List<Scene> scenes;
	public String name;
	int annee;

	public Festival() {
		scenes = new ArrayList<Scene>();
	}

	public Festival(String name) {
		this();
		this.name = name;
	}

	public Festival(String name, int annee) {
		super();
		this.name = name;
		this.annee = annee;
	}

	public Festival(List<Scene> scenes, String name) {
		this.scenes = scenes;
		this.name = name;
	}

	public Festival(List<Scene> scenes, String name, int annee) {
		super();
		this.scenes = scenes;
		this.name = name;
		this.annee = annee;
	}

	public List<Scene> getScenes() {
		return scenes;
	}

	public void setScenes(List<Scene> scenes) {
		this.scenes = scenes;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
}
