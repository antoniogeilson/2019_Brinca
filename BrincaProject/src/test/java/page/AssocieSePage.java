package page;

import org.openqa.selenium.WebDriver;

import actions.Actions;

public class AssocieSePage {

	private Actions actions;

	public AssocieSePage(WebDriver driver) {
		actions = new Actions(driver);
	}

}
