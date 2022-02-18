package controllerTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import controller.FestivalController;
import model.Data;
import model.Festival;
import model.Scene;

class FestivalControllerTest {

	FestivalController festivalController = new FestivalController();

	@Test
	public void createFestivalTestOk() {
		festivalController.createFestival("festivalTest", 2022);
		assertTrue(Data.getFestivals().get(Data.getFestivals().size() - 1).name.equals("festivalTest")
				&& Data.getFestivals().get(Data.getFestivals().size() - 1).getAnnee() == 2022);
	}

	@Test
	void deleteFestivalTestOk() {
		// GIVEN
		String name = "Penish";
		Festival festival = new Festival(name);
		Data.getFestivals().add(festival);

		// WHEN
		festivalController.deleteFestivalByName(name);

		// THEN
		assertFalse(Data.getFestivals().contains(festival));
	}

	@Test
	void deleteFestivalTestKo() {
		// GIVEN
		String name = "Penish";
		Festival festival = new Festival(name);
		Data.getFestivals().add(festival);

		// WHEN
		boolean result = festivalController.deleteFestivalByName("PasUnePenish");

		// THEN
		assertFalse(result);
	}

	@Test
	void createSceneAndAddToFestivalTest() {
		// GIVEN
		Festival f = new Festival("Penish");
		Data.getFestivals().add(f);
		Data.getFestivals().get(0).getScenes().add(new Scene("PasPenish"));

		// WHEN
		festivalController.createSceneAndAddToFestival("Scenene", "Penish");

		// THEN
		Festival fResult = Data.getFestivals().get(Data.getFestivals().size() - 1);
		assertTrue(fResult.getScenes() //
				.get(fResult.getScenes().size() - 1) //
				.getName().equals("Scenene"));
	}

	@Test
	public void deleteSceneFromFestivalTestWhenFesitvalAndSceneExist() {
		Data.getFestivals().add(new Festival("fTest"));
		Data.getFestivals().get(0).getScenes().add(new Scene("scene"));

		assertTrue(festivalController.deleteSceneFromFestival("fTest", "scene"));
	}

	@Test
	public void deleteSceneFromFestivalTestWhenFesitvalAndSceneDoesNotExist() {
		assertFalse(festivalController.deleteSceneFromFestival("fTest", "scene"));
	}

	@Test

	public void deleteSceneFromFestivalTestWhenFesitvalExistsAndSceneDoesNotExists() {
		Data.getFestivals().add(new Festival("fTest"));
		assertFalse(festivalController.deleteSceneFromFestival("fTest", "scene"));
	}

	@Test
	public void modificationNameFestivalByFestivalNameOk() {
		Data.getFestivals().add(new Festival("oldName"));
		festivalController.modificationFestivalByName("oldName", "newName");
		assertTrue(Data.getFestivals().get(0).getName().equals("newName"));
	}

	@Test
	public void modificationNameFestivalByFestivalNameKoSameName() {
		Data.getFestivals().add(new Festival("Name"));
		Data.getFestivals().add(new Festival("SecondName"));
		festivalController.modificationFestivalByName("SecondName", "Name");
		assertTrue(Data.getFestivals().get(1).getName().equals("SecondName"));

	}

}