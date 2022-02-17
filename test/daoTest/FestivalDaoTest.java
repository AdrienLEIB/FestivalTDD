package daoTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import dao.FestivalDAO;
import model.Festival;
import model.Scene;

public class FestivalDaoTest {

	FestivalDAO festivalDao;

	@Test
	public void getFestivalsTestNotNull() {
		festivalDao = new FestivalDAO();
		assertNotNull(festivalDao.getAllFestivals());
	}

	@Test
	public void addFestivalToListTestOK() {
		festivalDao = new FestivalDAO();
		Festival festival = new Festival();
		assertTrue(festivalDao.addFestivaltoList(festival));

	}

	@Test
	public void deleteFestivalFromListTestOK() {
		festivalDao = new FestivalDAO();
		Festival festival = new Festival();
		festivalDao.getAllFestivals().add(festival);
		assertTrue(festivalDao.deleteFestivalFromList(festival));

	}

	@Test
	public void addSceneToFestivalTest() {
		festivalDao = new FestivalDAO();
		Festival f = new Festival();
		Scene s = new Scene();
		assertTrue(festivalDao.addSceneToFestival(s, f));
	}

}
