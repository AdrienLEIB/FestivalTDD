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

}
