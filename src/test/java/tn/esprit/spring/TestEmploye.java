package tn.esprit.spring;


import java.text.ParseException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.EntrepriseServiceImpl;
import tn.esprit.spring.services.IEmployeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEmploye {
	private static final Logger L = LogManager.getLogger(EntrepriseServiceImpl.class);

	@Autowired
	IEmployeService empservices;
	
	@Test
	public void contextLoads() {
	}
	//ajout Employe by Amine Baklouti.
	@Test
	public void testajouterEmploye() throws ParseException{
		Employe emp = new Employe("amine", "baklouti", "amine.baklouti@esprit.tn", true, Role.ADMINISTRATEUR);
		empservices.addOrUpdateEmploye(emp);

}
	@Test
	public void testAffecterEmploye() throws ParseException{
		// test affectation

		empservices.affecterEmployeADepartement(1, 1);
		
	}
	
	@Test
	public void AllEmploye() throws ParseException{
		// test all Employée prenom By ID
	L.info("++++++++"+empservices.getEmployePrenomById(1));
	}
	
	@Test
	public void NombreEmploye() throws ParseException{
	L.info("++++++++"+empservices.getNombreEmployeJPQL());
}
	
}