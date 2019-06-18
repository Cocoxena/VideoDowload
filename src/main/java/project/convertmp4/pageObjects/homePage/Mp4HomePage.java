package project.convertmp4.pageObjects.homePage;

import project.convertmp4.allPagesObjects.AllPages;

public class Mp4HomePage extends AllPages {

	public Mp4HomePage() {
		super();
		System.out.println("A new home page was created");
	}

	public void run() {
		// waitForThePage(); // we run the parent class method if we add a parameter

		performActions();
	}
//
//	public void waitForThePage() {
//		Mp4HomePageChecks check = new Mp4HomePageChecks();
//		//check.waitForThePage();
//		System.out.println("The Home Page has been loaded");
//	}

	public void performActions() {
		Mp4HomePageActions actions = new Mp4HomePageActions();
		// actions.closeModal();
		System.out.println("La fenêtre Modal a bien été fermée");
		// actions.selectDepartureCity(DEPARTURE_CITY);

	}

}
