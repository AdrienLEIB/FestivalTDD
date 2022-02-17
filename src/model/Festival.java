package model;

import java.util.List;

public class Festival {
	List<Scene> scenes;
	String name;

	public Festival() {

	}

	public Festival(List<Scene> scenes, String name) {
		super();
		this.scenes = scenes;
		this.name = name;
	}

	public Festival(String name) {
		super();
		this.name = name;
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

}
