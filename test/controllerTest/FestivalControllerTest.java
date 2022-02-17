package controllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import controller.FestivalController;
import model.Data;
import model.Festival;

class FestivalControllerTest {

	FestivalController festivalController = new FestivalController();

	@Test
	void createFestivalTestOk() {
		// GIVEN
		String name = "Penish";

		// WHEN
		festivalController.createFestival(name);

		// THEN
		Festival lastFestival = Data.getFestivals() //
				.get(Data.getFestivals().size() - 1);
		assertEquals(name, lastFestival.getName());
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

}