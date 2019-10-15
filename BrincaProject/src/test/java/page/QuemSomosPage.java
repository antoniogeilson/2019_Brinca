package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.Actions;

public class QuemSomosPage {

	private Actions actions;

	public QuemSomosPage(WebDriver driver) {
		actions = new Actions(driver);
	}
	
	private WebElement checkQuemSomosPage() {		
		
		String xpathElement = "//*[@id=\"__next\"]/main/article/section/div/h3[1]";
			return actions.FindByXpath(xpathElement);
	}
	
	public void quemSomosContent() {
		
		String contentTitle = "Sua comunidade brasileira em Ottawa-Gatineau!";		
		actions.AssertTextValue(contentTitle, checkQuemSomosPage());
	
	}
	
	
}

