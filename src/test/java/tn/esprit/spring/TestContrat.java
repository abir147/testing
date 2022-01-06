package tn.esprit.spring;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.Test;
import org.junit.runner.RunWith;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.services.IEmployeService;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestContrat {
	@Autowired
	IEmployeService empservices;
	
	@Test
	public void TestAjouterContrat() throws ParseException {
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
     Date d = dateFormat.parse("2015-03-23");
		Contrat contra = new Contrat(d, "cdi", 3000);
		empservices.ajouterContrat(contra);
	
	}
	

}
