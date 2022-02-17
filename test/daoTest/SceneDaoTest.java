package daoTest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import dao.SceneDAO;
import model.Festival;
import model.Scene;

class SceneDaoTest {

	@Test
	void test() {
		fail("Not yet implemented");
	}

	SceneDAO sceneDao = new SceneDAO();

	@Test
	public void addSceneToFestivalTest() {
		Festival f = new Festival();
		Scene s = new Scene();
		assertTrue(sceneDao.addScenetoFestival(s));
	}

}
