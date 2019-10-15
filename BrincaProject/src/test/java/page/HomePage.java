package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import actions.Actions;

public class HomePage {

	private Actions actions;
	
	public HomePage(WebDriver driver) {
		actions = new Actions(driver);
	}
		
	public WebElement checkHomePage() {		
		
		String cssElement = "#__next>header>section>nav";
			return actions.FindByCssSelector(cssElement);
	}
			
	public void checkHeaderContent() {
		
		String headerValues = "Quem Somos\n" + "Associe-se\n" + "Eventos\n" + "Fale Conosco\n" + "(999) 9999.9999";		
		actions.AssertTextValue(headerValues, checkHomePage());
	}

}
