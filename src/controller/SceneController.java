package controller;

import dao.SceneDAO;
import model.Groupe;
import model.Scene;

public class SceneController {

	// crud
	SceneDAO sceneDao = new SceneDAO();

	public void createScene(String nom) {
		Scene scene = new Scene(nom);
		sceneDao.addScenetoList(scene);
	}

	public boolean deleteSceneByName(String name) {

		Scene sceneByName = sceneDao.getSceneByName(name);

		if (sceneByName != null) {
			sceneDao.deleteSceneFromList(sceneByName);
			return true;
		}

		return false;
		// TODO Auto-generated method stub

	}

	public boolean createGroupeAndAddToScene(String string, String string2) {

		Scene s = sceneDao.getLastSceneByName(string);
		if (s == null)
			return false;

		Groupe g = new Groupe(string2);
		return sceneDao.addGroupeToScene(g, s);

	}

	public boolean deleteGroupeFromScene(String string, String string2) {
		Scene s = sceneDao.getLastSceneByName(string);
		Groupe g = sceneDao.getLastGroupeByNameFromScene(s, string2);

		if (s != null && g != null) {
			return (sceneDao.deleteGroupeFromScene(g, s));

		}
		return false;
	}

	public boolean modificationSceneByName(String string, String string2) {
		// TODO Auto-generated method stub
		if (sceneDao.getLastSceneByName(string2) == null && sceneDao.getLastSceneByName(string) != null) {
			Scene s = sceneDao.getLastSceneByName(string);
			sceneDao.modifNomScene(s, "newName");
			return true;
		}
		;

		return false;
	}

	/*
	 * public boolean deleteFestivalByName(String name) {
	 * 
	 * Festival festivalByName = festivalDao.getFestivalByName(name);
	 * 
	 * if (festivalByName != null) {
	 * festivalDao.deleteFestivalFromList(festivalByName); return true; }
	 * 
	 * return false; }
	 */

}
