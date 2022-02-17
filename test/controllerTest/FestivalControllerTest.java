package controllerTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
		festivalController.createFestival(name);
		Festival lastFestival = Data.getFestivals() //
				.get(Data.getFestivals().size() - 1);
		assertEquals(name, lastFestival.getName());

		// WHEN
		festivalController.deleteFestivalByName(name);

		// THEN
		;
	}

}