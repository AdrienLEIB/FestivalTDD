package dao;

import java.util.ArrayList;
import java.util.List;

import model.Data;
import model.Festival;
import model.Groupe;
import model.Scene;

public class SceneDAO {

	Scene s1;
	Scene s2;
	Scene s3;

	// List<Festival> festivals;

	public SceneDAO() {
		s1 = new Scene();
		s2 = new Scene();
		s3 = new Scene();

		Data.setScenes(new ArrayList<>());
	}

	public List<Festival> getAllFestivals() {
		return Data.getFestivals();
	}

	public boolean addScenetoFestival(Scene scene) {
		return false;
	}

	public boolean addScenetoList(Scene scene) {
		return (Data.getScenes().add(scene));
	}

	public boolean deleteSceneFromList(Scene scene) {

		return (Data.getScenes().remove(scene));
	}

	public List<Scene> getAllScenes() {
		return Data.getScenes();
	}

	public boolean delete(Scene scene) {
		return false;
	}

	public List<Scene> getScenesFromFestival() {
		return null;
	}

	public boolean addGroupeToScene(Groupe g, Scene s) {
		// TODO Auto-generated method stub
		return s.getGroupes().add(g);
	}

	public boolean deleteGroupeFromScene(Groupe g, Scene s) {
		// TODO Auto-generated method stub
		return s.getGroupes().remove(g);
	}

	public Groupe getLastGroupeByNameFromScene(Scene s, String string) {
		Groupe groupeToBeReturned = null;

		try {
			for (Groupe groupe : s.getGroupes()) {
				if (groupe.getName().equals(string))
					groupeToBeReturned = groupe;
			}

		} catch (NullPointerException e) {

		} finally {
			return groupeToBeReturned;
		}
	}

	public void modifNomScene(Scene s, String string) {
		// TODO Auto-generated method stub
		s.setName(string);

	}

	public Scene getSceneByName(String name) {
		Scene sToReturn = null;

		for (Scene s : Data.getScenes()) {
			if (s.getName().equals(name)) {
				sToReturn = s;
			}
		}

		return sToReturn;
	}

	public Scene getLastSceneByName(String string) {
		Scene sToBeReturned = null;
		for (Scene scene : getAllScenes()) {
			if (scene.name.equals(string))
				sToBeReturned = scene;
		}
		return sToBeReturned;
	}

}
