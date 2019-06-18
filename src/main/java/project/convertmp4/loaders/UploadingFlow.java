package project.convertmp4.loaders;

import project.convertmp4.constants.convertmp4Constants;
import project.convertmp4.main.MyDriver;
import project.convertmp4.pageObjects.homePage.Mp4HomePage;

public class UploadingFlow {

	public UploadingFlow() {
		super();
		new MyDriver();
		// le Driver prend la valeur de l'URL du site choisi
		MyDriver.driver.get(convertmp4Constants.CONVERT_MP4_HOME_PAGE);

	}

//	protected void disponibilityPageRun() {
//		// DisponibilityPage disponibility = new DisponibilityPage();
//		// disponibility.run();
//	}
//
//	protected void passengerPageRun() {
//		// PassengerPage passenger = new PassengerPage();
//		// passenger.run();
//	}

	// instanciation de la méthode homePageRun()
	public void uploadingRun() {
		homePageRun();
		// disponibilityPageRun();
		// passengerPageRun();
	}

	// instanciation de la méthode run() de la page d'accueil
	protected void homePageRun() {
		Mp4HomePage home = new Mp4HomePage();
		home.run();
	}
}
