package daoTest;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import dao.FestivalDAO;
import model.Festival;

public class FestivalDaoTest {

	FestivalDAO festivalDao;

	@Test
	public void getFestivalsTestNotNull() {
		festivalDao = new FestivalDAO();
		assertNotNull(festivalDao.getFestivals());
	}

	@Test
	public void addFestivalToListTestOK() {
		festivalDao = new FestivalDAO();
		Festival festival = new Festival();
		assertTrue(festivalDao.addFestivalToList(festival));

	}

	@Test
	public void deleteFestivalFromListTestOK() {
		festivalDao = new FestivalDAO();
		Festival festival = new Festival();
		festivalDao.getFestivals().add(festival);
		assertTrue(festivalDao.deleteFestivalToList(festival));

	}

}
