package model;

import java.util.List;

public class Data {

	static List<Festival> festivals;
	static List<Scene> scenes;

	public static List<Scene> getScenes() {
		return scenes;
	}

	public static void setScenes(List<Scene> scenes) {
		Data.scenes = scenes;
	}

	public static List<Festival> getFestivals() {
		return festivals;
	}

	public static void setFestivals(List<Festival> festivals) {
		Data.festivals = festivals;
	}

}