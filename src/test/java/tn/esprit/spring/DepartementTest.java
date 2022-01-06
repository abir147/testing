
package tn.esprit.spring;

import java.text.ParseException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.services.DepartementServiceImpl;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartementTest {
	private static final Logger L = LogManager.getLogger(DepartementServiceImpl.class);
	@Autowired
	IEntrepriseService entrepservice;

	@Test
	public void contextLoads() {
	}

	// ajout Employe by ghaith.

	@Test
	public void testajouterEmploye() throws ParseException {
		Departement dep = new Departement(2, "ll");
		entrepservice.ajouterDepartement(dep);
	}

	@Test
	public void affecterDepartementAEntrepriseTest() throws ParseException {
		entrepservice.affecterDepartementAEntreprise(2, 1);
	}

	@Test
	public void testdeleteDepartementById() throws ParseException {
		entrepservice.deleteDepartementById(7);
	}

	// L.info(entrepservice.getAllDepartementsNamesByEntreprise(1));

}
