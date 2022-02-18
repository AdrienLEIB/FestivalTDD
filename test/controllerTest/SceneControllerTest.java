package controllerTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import controller.SceneController;
import model.Data;
import model.Groupe;
import model.Scene;

class SceneControllerTest {

	SceneController sceneController = new SceneController();

	@Test
	public void createSceneTestOk() {
		sceneController.createScene("sceneTest");
		assertTrue(Data.getScenes().get(Data.getScenes().size() - 1).name.equals("sceneTest"));
	}

	@Test
	void deleteSceneTestOk() {
		// GIVEN
		String name = "Parc des princes";
		Scene scene = new Scene(name);
		Data.getScenes().add(scene);

		// WHEN
		sceneController.deleteSceneByName(name);

		// THEN
		assertFalse(Data.getScenes().contains(scene));
	}

	@Test
	void deleteSceneTestKo() {
		// GIVEN
		String name = "Parc des princes";
		Scene scene = new Scene(name);
		Data.getScenes().add(scene);

		// WHEN
		boolean result = sceneController.deleteSceneByName("Pas de  pac des princes");

		// THEN
		assertFalse(result);
	}

	@Test
	void createGroupeAndAddToSceneTest() {
		// GIVEN
		Scene s = new Scene("PSG");
		Data.getScenes().add(s);
		Data.getScenes().get(0).getGroupes().add(new Groupe("PSG2"));

		// WHEN
		sceneController.createGroupeAndAddToScene("groupe", "PSG");

		// THEN
		Scene sResult = Data.getScenes().get(Data.getScenes().size() - 1);
		assertTrue(sResult.getGroupes() //
				.get(sResult.getGroupes().size() - 1) //
				.getName().equals("groupe"));
	}

	@Test
	public void deleteGroupeFromSceneTestWhenSceneAndGroupeExist() {
		Data.getScenes().add(new Scene("sTest"));
		Data.getScenes().get(0).getGroupes().add(new Groupe("groupe"));

		assertTrue(sceneController.deleteGroupeFromScene("sTest", "groupe"));
	}

	@Test
	public void deleteGroupeFromSceneTestWhenSceneAndGroupeDoesNotExist() {
		assertFalse(sceneController.deleteGroupeFromScene("fTest", "scene"));
	}

	@Test

	public void deleteGroupeFromSceneTestWhenSceneExistsAndGroupeDoesNotExists() {
		Data.getScenes().add(new Scene("fTest"));
		assertFalse(sceneController.deleteGroupeFromScene("fTest", "groupe"));
	}

	@Test
	public void modificationNameSceneBySceneNameOk() {
		Data.getScenes().add(new Scene("oldName"));
		sceneController.modificationSceneByName("oldName", "newName");
		assertTrue(Data.getScenes().get(0).getName().equals("newName"));
	}

	@Test
	public void modificationNameSceneByGroupeNameKoSameName() {
		Data.getScenes().add(new Scene("Name"));
		Data.getScenes().add(new Scene("SecondName"));
		sceneController.modificationSceneByName("SecondName", "Name");
		assertTrue(Data.getScenes().get(1).getName().equals("SecondName"));

	}

}
