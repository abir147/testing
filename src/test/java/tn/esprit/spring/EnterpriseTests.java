package tn.esprit.spring;

import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnterpriseTests {
	
	@Autowired
	IEntrepriseService entrepservice;	
	
	@Test
	public void contextLoads() {
	}

	@Test
	public void testajouterEntreprise() throws ParseException{
	Entreprise entreprise = new Entreprise("SSII consulting", "ARIANA");
	entrepservice.ajouterEntreprise(entreprise);
	}
	
	@Test
	public void testajouterDepartement() throws ParseException{
	Departement  departement = new Departement("marketing");
	entrepservice.ajouterDepartement(departement);
	}
	
	@Test
	public void testaffecterDepartementAEntreprise() throws ParseException{
		entrepservice.affecterDepartementAEntreprise(2, 2);
	}
	
	@Test
	public void testgetAllDepartementsNamesByEntreprise() throws ParseException{
		entrepservice.getAllDepartementsNamesByEntreprise(2);
	}
	
	@Test
	public void testgetEntrepriseById() throws ParseException{
		entrepservice.getEntrepriseById(2);
	}
	
	@Test
	public void testdeleteEntrepriseById() throws ParseException{
		Entreprise entreprise = new Entreprise("Entreprise to delete", "somewhere in the planet");
		int deletedEntrepriseId = entrepservice.ajouterEntreprise(entreprise);
		entrepservice.deleteEntrepriseById(deletedEntrepriseId);
	}
	
	@Test
	public void testdeleteDepartementById() throws ParseException{
		Departement  departement = new Departement("departement to delete");
		int deletedDepartementId = entrepservice.ajouterDepartement(departement);		
		entrepservice.deleteDepartementById(deletedDepartementId);
	}
	
}
