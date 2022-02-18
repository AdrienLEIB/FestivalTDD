package daoTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import dao.SceneDAO;
import model.Data;
import model.Groupe;
import model.Scene;

class SceneDaoTest {

	SceneDAO sceneDao = new SceneDAO();

	@Test
	public void getScenesTestNotNull() {
		sceneDao = new SceneDAO();
		assertNotNull(sceneDao.getAllScenes());
	}
	/*
	 * @Test public void addSceneToFestivalTest() { Festival f = new Festival();
	 * Scene s = new Scene(); assertTrue(sceneDao.addScenetoFestival(s)); }
	 */

	@Test
	public void deleteFestivalFromListTestOK() {
		sceneDao = new SceneDAO();
		Scene scene = new Scene();
		sceneDao.getAllScenes().add(scene);
		assertTrue(sceneDao.deleteSceneFromList(scene));

	}

	@Test
	public void addSceneToListTestOK() {
		sceneDao = new SceneDAO();
		Scene scene = new Scene();
		assertTrue(sceneDao.addScenetoList(scene));

	}

	@Test
	public void addGroupeToSceneTest() {
		sceneDao = new SceneDAO();
		Groupe g = new Groupe();
		Scene s = new Scene();
		assertTrue(sceneDao.addGroupeToScene(g, s));
	}

	@Test
	public void deleteGroupeFromScene() {
		sceneDao = new SceneDAO();
		Groupe g = new Groupe();

		Scene s = new Scene();
		Data.getScenes().add(s);
		Data.getScenes().get(0).getGroupes().add(g);
		assertTrue(sceneDao.deleteGroupeFromScene(g, s));
		assertEquals(0, sceneDao.getAllScenes().get(0).getGroupes().size());
	}

	@Test
	public void getLastGroupeByNameFromSceneTestOk() {
		sceneDao = new SceneDAO();
		Groupe g = new Groupe("groupeTest");
		Scene s = new Scene();
		Data.getScenes().add(s);
		Data.getScenes().get(0).getGroupes().add(g);

		assertNotNull(sceneDao.getLastGroupeByNameFromScene(s, "groupeTest"));

	}

	// getLastSceneByNameFromFestival(f, nomScene);
	@Test
	public void getLastGroupeByNameFromSceneTestReturnNull() {
		sceneDao = new SceneDAO();
		Scene s = new Scene();
		// Scene s = new Scene("sceneTest");
		Data.getScenes().add(s);
		// Data.getFestivals().get(0).getScenes().add(s);

		assertNull(sceneDao.getLastGroupeByNameFromScene(s, "groupeTest"));

	}

	@Test
	public void getLastGroupeByNameFromSceneWhenSceneIsNull() {
		sceneDao = new SceneDAO();
		Scene s = null;

		assertNull(sceneDao.getLastGroupeByNameFromScene(s, "groupeTest"));

	}

	@Test
	public void modifNomFestivalOk() {
		sceneDao = new SceneDAO();
		Scene s = new Scene("OldName");
		sceneDao.modifNomScene(s, "newName");
		assertEquals("newName", s.getName());
	}

}
