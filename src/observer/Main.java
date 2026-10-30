package observer;

import java.util.Observable;

import adapter2.ShowPacientTableGUI;
import domain.Covid19Pacient;
import factory.FactorySymptom;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Covid19Pacient	pacient=new	Covid19Pacient("aitor",	35, new FactorySymptom());
		new	PacientObserverGUI(pacient);
		new	PacientSymptomGUI(pacient);
		new PacientThermometerGUI(pacient);
		new SemaphorGUI(pacient);
		ShowPacientTableGUI gui = new ShowPacientTableGUI(pacient);
		gui.setSize(500, 300);
		gui.setLocation(200, 400);
		gui.setVisible(true);
		/*
		Covid19Pacient	pacient2=new	Covid19Pacient("ane",	22, new FactorySymptom());
		new	PacientObserverGUI(pacient2);
		new	PacientSymptomGUI(pacient2);
		new PacientThermometerGUI(pacient2);
		new SemaphorGUI(pacient2);
		new ShowPacientTableGUI(pacient2);
		
		Covid19Pacient	pacient3 = new	Covid19Pacient("mikel",	17, new FactorySymptom());
		new	PacientObserverGUI(pacient3);
		new	PacientSymptomGUI(pacient3);
		new PacientThermometerGUI(pacient3);
		new SemaphorGUI(pacient3);
		new ShowPacientTableGUI(pacient3);
		*/
	}


}
