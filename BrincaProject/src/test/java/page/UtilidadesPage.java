package page;

import org.openqa.selenium.WebDriver;

import actions.Actions;

public class UtilidadesPage {

	private Actions actions;

	public UtilidadesPage(WebDriver driver) {
		actions = new Actions(driver);
	}

}
