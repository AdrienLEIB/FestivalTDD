package model;

import java.util.List;

public class Data {

	static List<Festival> festivals;

	public static List<Festival> getFestivals() {
		return festivals;
	}

	public static void setFestivals(List<Festival> festivals) {
		Data.festivals = festivals;
	}

}