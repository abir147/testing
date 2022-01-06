package tn.esprit.spring;
import tn.esprit.spring.entities.Mission;
import tn.esprit.spring.services.ITimesheetService;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import java.text.ParseException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
@RunWith(SpringRunner.class)
@SpringBootTest

public class TestMission {
	@Autowired
	ITimesheetService timeservices;
	
	@Test
	public void TestAjouterMission() {
	Mission mission = new Mission("Tunis", "travail");
	timeservices.ajouterMission(mission);
	}
	@Test
	public void TestAffecterMission() {
	Mission mission = new Mission("Tunis", "travail");
	timeservices.affecterMissionADepartement(1, 1);
	}
	
}
