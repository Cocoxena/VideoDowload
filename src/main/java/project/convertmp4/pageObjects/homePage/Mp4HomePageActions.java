package project.convertmp4.pageObjects.homePage;

import org.openqa.selenium.By;

import project.convertmp4.main.MyDriver;

public class Mp4HomePageActions {

	/*
	 * ACTIONS
	 */

	// fermer la fenêtre Modal au lancement de la page en trouvant le 2ème élément
	// du sélecteur css
	public void closeModal() {
		MyDriver.driver.findElements(By.cssSelector(Mp4HomePageIDs.MODAL_CLOSE_BUTTON_CSS)).get(1).click();

	}

//	public void selectDepartureCity(String departureCity) {
//		Select departure_City = new Select(MyDriver.driver.findElement(By.id(Mp4HomePageIDs.DEPARTURE_FROM_CITY_ID)));
//		departure_City.selectByValue("NCE");
//
//	}
//s
//	public void selectArrivalCity(String arrivalCity) {
//		Select arrival_City = new Select(MyDriver.driver.findElement(By.id(Mp4HomePageIDs.ARRIVAL_TO_CITY_ID)));
//		arrival_City.selectByValue("HND");
//	}
//
//	public void setDepartureDate(String departureDate, String departureMonth) {
//		Select departure_day_date = new Select(MyDriver.driver.findElement(By.id(Mp4HomePageIDs.DEPARTURE_DATE_1_DAY)));
//		departure_day_date.selectByValue("1");
//		Select departure_month_date = new Select(
//				MyDriver.driver.findElement(By.id(Mp4HomePageIDs.DEPARTURE_DATE_1_MONTH)));
//		departure_month_date.selectByValue("12");
//	}
//
//	public void setReturnDate(String returnDate, String returnMonth) {
//		Select return_day_date = new Select(MyDriver.driver.findElement(By.id(Mp4HomePageIDs.DEPARTURE_DATE_2_DAY)));
//		return_day_date.selectByValue("15");
//		Select return_month_date = new Select(MyDriver.driver.findElement(By.id(Mp4HomePageIDs.DEPARTURE_DATE_2_MONTH)));
//		return_month_date.selectByValue("12");
//
//	}
//
//	public void setTravelClass(String travelClass) {
//		// Select travel_class = new
//		// Select(MyDriver.driver.findElement(By.id(HomePageIDs.)));
//		// travel_class.selectByValue("1");
//	}
//
//	protected void clickSearchButton() {
//		MyDriver.driver.findElement(By.id(Mp4HomePageIDs.SEARCH_BUTTON_ID)).click();
//	}

	/*
	 * CHECKS
	 */
}
