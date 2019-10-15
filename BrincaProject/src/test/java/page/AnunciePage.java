package page;

import org.openqa.selenium.WebDriver;

import actions.Actions;

public class AnunciePage {

	private Actions actions;

	public AnunciePage(WebDriver driver) {
		actions = new Actions(driver);
	}

}
